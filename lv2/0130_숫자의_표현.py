# ex) even count -> 1 2 3 4 -> mid is 2.5 (.5)
# ex) odd count -> 1 2 3 -> mid is 2 (.0)
def solution(n):
    answer = 1
    can_start = lambda start_num: 1 <= start_num
    is_correct_even = lambda mid: (mid - 0.5) % 1 == 0
    is_correct_odd = lambda mid, count: (mid % 1 == 0) and count % 2 != 0
    
    for count in range(2, n // 2 + 1):
        mid = n / count
        start_num = mid - count // 2 
        
        answer += is_correct_even(mid) and can_start(start_num - 0.5)
        answer += is_correct_odd(mid, count) and can_start(start_num)
        
    return answer