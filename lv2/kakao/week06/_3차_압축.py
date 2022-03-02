def solution(msg):
    answer = []
    dict_list = [chr(a) for a in range(ord('A'), ord('Z') + 1)]

    end = msg[0]
    i = 0
    while i < len(msg) - 1:
        # 사전에 있다면 검색을 이어나간다.
        if end in dict_list:
            i += 1
            end += msg[i]

        # 사전에 없다면 사전에 등록하고 이전 문자열을 출력
        else:
            dict_list.append(end)
            answer.append(dict_list.index(end[:-1]) + 1)
            end = end[-1]
        
    
    # 마지막 검사
    if end not in dict_list:
        answer.append(dict_list.index(end[:-1]) + 1)
        answer.append(dict_list.index(end[-1]) + 1)
    else:
        answer.append(dict_list.index(end) + 1)
    return answer