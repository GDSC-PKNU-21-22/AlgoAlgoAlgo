def solution(s):
    center = len(s) // 2
    get_if_even = lambda x: x[center - 1] if len(x) % 2 == 0 else ""
    return get_if_even(s) + s[center]