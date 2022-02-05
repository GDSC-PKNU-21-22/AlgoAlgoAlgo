def solution(n):
    dp = [0, 1]
    for i in range(n):
        dp[0], dp[1] = dp[0] + dp[1], dp[0]
    return dp[0] % 1234567