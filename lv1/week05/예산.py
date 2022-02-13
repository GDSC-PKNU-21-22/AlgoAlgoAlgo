def solution(d, budget):
    total = 0
    count = 0
    for request in sorted(d):
        total += request
        count += 1
        if total > budget:
            return count - 1
            
        elif total == budget:
            return count
    return count
        
        