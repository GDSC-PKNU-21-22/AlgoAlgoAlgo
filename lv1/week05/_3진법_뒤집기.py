def solution(n):
    result = ''

    while n > 0:
        n, mod = divmod(n, 3)
        result += str(mod)

    i = 1
    answer = 0
    for n in result[::-1]:
        answer += i * int(n)
        i *= 3
        

    return answer 