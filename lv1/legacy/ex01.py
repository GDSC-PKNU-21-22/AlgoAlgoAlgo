class Result:
    def __init__(self, score, bonus) -> None:
        self.score = int(score)
        self.bonus = bonus
        self.opt = None
        self.next_opt = None
        self.total = 0
        
    def get_total_score(self):
        total = pow(self.score, self.__get_bonus_num())
        
        if self.opt == '*':
            total *= 2
        elif self.opt == '#':
            total *= -1

        return total * 2 if self.next_opt == '*' else total

    def __get_bonus_num(self):
        if self.bonus == 'S':
            return 1
        elif self.bonus == 'D':
            return 2
        else:
            return 3

def solution(dartResult):
    score_stack = []
    end = ''
    
    for c in dartResult:
        if c in ['S', 'D', 'T']:
            score_stack.append(Result(score, c))

        elif c in ['*', '#']:
            score_stack[-1].opt = c
            
            if len(score_stack) > 1:
                score_stack[-2].next_opt = c
            
        else:
            score = 10 if end.isdigit() else int(c)
        
        end = c
            
    return sum(s.get_total_score() for s in score_stack)