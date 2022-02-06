def solution(sizes):
    box = [0, 0]
    for size in sizes:
        box[0] = max(box[0], min(size))
        box[1] = max(box[1], max(size))
        
    return box[0] * box[1]