def solution(land):
    ROW, COL = len(land), 4
    
    dp = [land[0][i] for i in range(COL)]
    prev_max = lambda i, col: max([dp[i] for i in range(COL) if i != col])
    
    for i in range(1, ROW):
        dp = [land[i][col] + prev_max(i, col) for col in range(COL)]
        
    return max(dp)