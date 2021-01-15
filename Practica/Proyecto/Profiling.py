import cProfile
from Practica import suma

def prueba():
    suma(10000)

cProfile.run('prueba()')