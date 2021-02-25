def palindromo(palabra):
    #esto pasa a minúsculas la palabra para poder comprobar
    #Ejemplo "reconocer" y "ReconOcer"
    palabra = palabra.lower() 

    largo = len(palabra)

    for i in range(0, largo):
        if palabra[i] == palabra[(largo - 1) - i]: 
            pass
        else: 
            return False

    return True

palabra1 = str(input("Inserte una palabra: "))

print(palindromo(palabra1))