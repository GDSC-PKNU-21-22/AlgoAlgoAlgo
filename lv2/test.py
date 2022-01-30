import unittest

class Test(unittest.TestCase):
    
    def test_ex01_01(self):
        from .kakao.ex_01 import solution
        
        s = "aabbaccc"
        result = 7
        
        self.assertEqual(result, solution(s))

    def test_ex01_02(self):
        from .kakao.ex_01 import solution
        
        s = "ababcdcdababcdcd"
        result = 9
        
        self.assertEqual(result, solution(s))
        
    def test_ex01_03(self):
        from .kakao.ex_01 import solution
        
        s = "abcabcdede"
        result = 8
        
        self.assertEqual(result, solution(s))
        
    def test_ex01_04(self):
        from .kakao.ex_01 import solution
        
        s = "abcabcabcabcdededededede"
        result = 14
        
        self.assertEqual(result, solution(s))
        
    def test_ex01_05(self):
        from .kakao.ex_01 import solution
        
        s = "xababcdcdababcdcd"
        result = 17
        
        self.assertEqual(result, solution(s))

    def test_ex01_06(self):
        from .kakao.ex_01 import solution
        
        s = "a"
        result = 1
        
        self.assertEqual(result, solution(s))