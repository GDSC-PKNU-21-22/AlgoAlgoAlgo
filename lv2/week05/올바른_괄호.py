def solution(s):
    stack = 0

    for i in s:
        stack += 1 if i == '(' else -1
        
        if stack < 0:
            return False
    
    return stack == 0