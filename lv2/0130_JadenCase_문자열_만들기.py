def solution(s):
    answer = ''
    prev = ' '
    
    for arr in s:
        answer += arr.upper() if prev == ' ' else arr.lower()
        prev = arr
        
    return answer