from random import randint, random

def generar(n, search):
    lista = []

    for i in range(n): 
        lista.append(randint(0,n))
    
    print(lista)

    for i in lista: 
        if i == search:
            return True
            break

    return False


def order_list(n, search):
    lista = []
    buscador = True

    minimo = 0
    for i in range(n):
        minimo = randint(minimo, minimo+25)
        lista.append(minimo)
    print(lista)
    
    #Las siguientes variables manipulan las direcciones de la lista 
    mini = 0
    medio = 0 
    maximo = len(lista) - 1
    
    while mini <= maximo:
        medio = (mini + maximo) // 2
 
        if lista[medio] < search:
            mini = medio + 1

        elif lista[medio] > search:
            maximo = medio - 1
        
        else:
            return True
 
    return False

print(generar(300, 5))

#print(order_list(100, 34))