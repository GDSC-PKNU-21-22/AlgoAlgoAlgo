def convert(n, k):
    result = ''
    alpha_list = [chr(ord('A') + a) for a in range(6)]

    while n > 0:
        n, mod = divmod(n, k)
        result += str(mod) if mod < 10 else alpha_list[mod - 10]

    if result == '':
        result = '0'
    return result[::-1]

def solution(n, t, m, p):
    total_str = ''
    for i in range(t * m):
        total_str += convert(i, n)
        
    answer= ''
    for i in range(t):
        turn = p + i * m - 1
        answer += total_str[turn]

    return answer