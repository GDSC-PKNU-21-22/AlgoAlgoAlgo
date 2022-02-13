def solution(n):
    answer = 0
    prime_list = [True] * (n + 1)
    
    for i in range(2, n + 1):
        # 누군가의 배수인 적이 없는 수
        answer += prime_list[i] 

        # 배수 체크
        for j in range(i, n + 1, i):
            prime_list[j] = False
            
    return answer
