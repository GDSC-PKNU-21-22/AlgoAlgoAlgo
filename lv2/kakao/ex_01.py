# 문자열 압축
def cut(s, count):
    prev = s[:count]
    pattern = {}
    result = len(s)

    for i in range(count, len(s)):
        if i + count > len(s):
            break
        
        if prev == s[i:i + count]:

            if prev in pattern:
                pattern[prev] += 1
            else:
                pattern[prev] = 2
            
        
        prev = prev[1:] + s[i]
    
    # TODO: 중복제거
    
    for p in pattern.values():
        result += 1
        result -= count * (p - 1)
    
    print(pattern, count, result)
    
    return result

def solution(s):
    result = len(s)
    
    for i in range(len(s) // 2):
        result = min(result, cut(s, i))
    
    return result