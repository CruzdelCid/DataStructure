from Practica import suma
import unittest

class TestP(unittest.TestCase):

    #Número entero
    def test_caso_1(self):
        entrada = 5
        salida = 15
        self.assertTrue(salida, suma(entrada))
    
    def test_caso_2(self):
        entrada = 7
        salida = 28
        self.assertTrue(salida, suma(entrada))

    #Validación número decimal
    def test_caso_3(self):
        entrada = 5.1
        salida = 'N no es natural'
        self.assertTrue(salida, suma(entrada))
    
    def test_caso_4(self):
        entrada = 88.5
        salida = 'N no es natural'
        self.assertTrue(salida, suma(entrada))
    
    
    #Validación de números negativos
    def test_caso_5(self):
        entrada = -2
        salida = 'N no es natural'
        self.assertTrue(salida, suma(entrada))
    
    def test_caso_6(self):
        entrada = 123.3
        salida = 'N no es natural'
        self.assertTrue(salida, suma(entrada))


if __name__ == "__main__":
    unittest.main()