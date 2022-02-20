def get_pivot(converted):
    pivot = -1
    for i in range(1, len(converted)):
        if converted[i - 1] + converted[i] == '01':
            pivot = i
            break
    return pivot

def reconvert(bin):
    k = 1
    result = 0
    for i in bin[::-1]:
        result += int(i) * k
        k *= 2
    return result
    
def solution(n):
    # '01'의 출현 기준으로 세 구역으로 나눈다.
    # 1. 1의 연속구역: 그대로
    # 2. 01구역: 10으로 변경
    # 3. 남은 구역: 1을 전부 오른쪽으로 쉬프트

    # ex) 111 / 01 / 010101
    # result -> 111 / 10 / 000111
    converted = bin(n)[2:]

    pivot = get_pivot(converted)
    if pivot == -1:
        converted = '0' + converted
        pivot = get_pivot(converted)

    answer = converted[:pivot - 1] + '10'
    if pivot < len(converted) - 1:
        answer += converted[pivot + 1:].count('0') * '0'
        answer += converted[pivot + 1:].count('1') * '1'

    return reconvert(answer)

################################################################
def solution(n):
    one_count = lambda x: bin(x)[2:].count('1')
    for i in range(n + 1, n * 2 + 1):
        if one_count(i) == one_count(n):
            return i