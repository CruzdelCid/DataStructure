#Ejercicio No. 1
def suma (n):
    result = 0
    if ("<class 'int'>" == f"{type(n)}"): #Validación
        while (n > 0): 
            result += n
            n += -1
    if (n == 0):
        return result
    else: 
        return "N no es natural"