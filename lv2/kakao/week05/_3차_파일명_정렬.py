def get_head(file_name):
    head = ""

    for c in file_name:
        if c.isdigit():
            break
        else:
            head += c.lower()
        
    return head
    
    
def get_number(file_name):
    number = ""
    started = False

    for c in file_name:
        if c.isdigit():
            started = True
            number += c

        if c.isalpha() and started:
            break
    
    return int(number)

def solution(files):
    return sorted(files, key= lambda x: (get_head(x), get_number(x)))