import unittest

class Test(unittest.TestCase):
    
    def test_ex01_01(self):
        from .ex01 import solution
        
        dartResult = "1S2D*3T"
        result = 37
        
        self.assertEqual(dartResult, result)
    
    def test_ex01_02(self):
        from .ex01 import solution
        
        dartResult = "1D2S#10S"
        result = 9
        
        self.assertEqual(dartResult, result)

    def test_ex01_03(self):
        from .ex01 import solution
        
        dartResult = "1D2S0T"
        result = 3
        
        self.assertEqual(dartResult, result)

    def test_ex01_04(self):
        from .ex01 import solution
        
        dartResult = "1S*2T*3S"
        result = 23
        
        self.assertEqual(dartResult, result)    
        
    def test_ex01_05(self):
        from .ex01 import solution
        
        dartResult = "1D#2S*3S"
        result = 5
        
        self.assertEqual(dartResult, result)

    def test_ex01_06(self):
        from .ex01 import solution
        
        dartResult = "1T2D3D#"
        result = -4
        
        self.assertEqual(dartResult, result)

    def test_ex01_07(self):
        from .ex01 import solution
        
        dartResult = "1D2S3T*"
        result = 59
        
        self.assertEqual(dartResult, result)