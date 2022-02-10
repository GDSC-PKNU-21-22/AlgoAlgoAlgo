def gcd(x, y):
    while y:
        x, y = y, x % y
    return x
    

def solution(arr):
    end = arr[0]
    
    for new in arr[1:]:
        end = new * end // gcd(new, end)
    
    return end