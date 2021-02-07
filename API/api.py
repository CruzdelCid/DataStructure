from flask import Flask
from random import randint, random

app = Flask(__name__)

@app.route('/lineal/<int:n>/<int:valor>', methods=['GET'])
def linear_search(n, valor): 
    lista = []

    for i in range(n): 
        lista.append(randint(0,n))
    
    for i in lista: 
        if i == valor:
            return "True"
            break

    return "False"



@app.route('/binary/<int:n>/<int:valor>', methods=['GET'])
def binary_search(n, valor): 
    lista = []

    minimo = 0
    for i in range(n):
        minimo = randint(minimo, minimo+25)
        lista.append(minimo)
    
    #Las siguientes variables manipulan las direcciones de la lista 
    mini = 0
    medio = 0 
    maximo = len(lista) - 1
    
    while mini <= maximo:
        medio = (mini + maximo) // 2
 
        if lista[medio] < valor:
            mini = medio + 1

        elif lista[medio] > valor:
            maximo = medio - 1
        
        else:
            return "True"
 
    return "False"


if __name__ == "__main__": 
    app.run(host = "0.0.0.0", port = 5000, debug = True)
