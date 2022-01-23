# 문자열 압축

def cut(s, count):
    result, pattern, prev = len(s), 0, s[:count]
    
    for i in range(count, len(s) - count + 1, count):
        cur = s[i:i + count]
        
        # 반복 횟수를 기록
        if prev == cur:
            pattern = 2 if pattern == 0 else pattern + 1

        # 줄인 길이 갱신
        elif pattern > 0:
            result += len(str(pattern)) - count * (pattern - 1)
            pattern = 0
        
        prev = cur
    
    if pattern > 0:
        result += len(str(pattern)) - count * (pattern - 1)
    
    return result

def solution(s):
    # s가 1글자일 때 예외처리
    return min([cut(s, i) for i in range(1, len(s))] + [len(s)])