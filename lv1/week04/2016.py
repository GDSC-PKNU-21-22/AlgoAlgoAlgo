def solution(month, day):
    week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    last_days = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30]
    month_to_day = lambda x: sum([last_days[m] for m in range(month)])

    return week[(month_to_day(month) + day + 4) % 7]