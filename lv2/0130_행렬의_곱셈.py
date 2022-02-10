def solution(arr1, arr2):
    # (a * b) X (b * c) = a * c
    a = len(arr1)
    b = len(arr1[0]) # == len(arr2)
    c = len(arr2[0])
    
    cell = lambda row, col: sum(arr1[row][i] * arr2[i][col] for i in range(b))
    
    return [[cell(row, col) for col in range(c)] for row in range(a)]