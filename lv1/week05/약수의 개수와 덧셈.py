def get_divisor_count(n):
    result = 1
    for i in range(1, n // 2 + 1):
        result += (n % i == 0)
    return result

def solution(left, right):
    answer = 0
    for i in range(left, right + 1):
        answer += i if get_divisor_count(i) % 2 == 0 else -i    
    return answer