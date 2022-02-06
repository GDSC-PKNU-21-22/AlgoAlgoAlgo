import re

def solution(s):
    pattern_len4 = re.compile("[0-9]{4}")
    pattern_len6 = re.compile("[0-9]{6}")
    return pattern_len4.fullmatch(s) is not None or pattern_len6.fullmatch(s) is not None

def solution(s):
    return (len(s) == 4 or len(s) == 6) and s.isdigit()