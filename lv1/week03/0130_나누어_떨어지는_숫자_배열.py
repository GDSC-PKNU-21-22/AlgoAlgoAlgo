def solution(arr, divisor):
    result = sorted(filter(lambda x: x % divisor == 0, arr)) 
    return [-1] if len(result) == 0 else result