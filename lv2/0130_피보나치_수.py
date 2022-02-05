def solution(n):
    dp = [0, 1]
    for i in range(n):
        dp[0], dp[1] = dp[0] + dp[1], dp[0]
    return dp[0] % 1234567

# fast fibo matrix
# Fn+1 	Fn		1	1
# Fn	Fn-1	1	0
class Matrix:
    def __init__(self, a = 1, b = 1, c = 1, d = 0):
        # Fn+1, Fn, Fn, Fn-1
        self.a, self.b, self.c, self.d = a, b, c, d
        
    def __mul__(self, other):
        a = self.a * other.a + self.b * other.c
        b = self.a * other.b + self.b * other.d
        c = self.c * other.a + self.d * other.c
        d = self.c * other.b + self.d * other.d
        
        return Matrix(a, b, c, d)
    
    def __pow__(self, n):
        if n == 1:
            return Matrix()

        half = self ** (n // 2)
        return half * half if n % 2 == 0 else half * half * Matrix()
    
    def __mod__(self, other):
        return self.b % other
        
def solution(n):
    return Matrix() ** n % 1234567