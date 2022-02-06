import math

def convert(n, k):
    result = ''
    
    while n > 0:
        n, mod = divmod(n, k)
        result += str(mod)
    return result[::-1]

def is_prime(string):
    if string == '' or string == '1':
        return False
    
    n = int(string)
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False

    return True 

def solution(n, k):
    converted = convert(n, k)
    
    prev = ''
    answer = 0
    
    for i in range(len(converted)):
        if converted[i] == '0':
            answer += is_prime(prev)
            prev = ''
        else:
            prev += converted[i]
            
    answer += is_prime(prev)

    return answer