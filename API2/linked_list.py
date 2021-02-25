class Cancion: 
    def __init__ (self, nombre = None, previous = None, nex = None):

        self.nombre = nombre 
        self.previous = previous
        self.next = nex

class Linked: 
    def __init__(self):
        self.head = None
        self.play = None

    # Método para agregar elementos al final de la linked list
    def añadir(self, nombre):

        cancion = self.head

        if not self.head:
            self.head = Cancion(nombre=nombre)
        else: 
            while cancion.next is not None:
                cancion = cancion.next
            cancion.next = Cancion(nombre=nombre, previous=cancion)


    # Método para retornar el nombre de la canción a reproducir, si el usuario no ingresa el número se reproduce la primera 
    def play_now(self, position = 1):

        cancion = self.head
        for i in range(1, position):
            if (cancion.next): 
                cancion = cancion.next 
            else: 
                return "La canción no se encuentra." 
        self.play = cancion
        return cancion.nombre


    def play_next(self):

        if (self.play.next is not None): 
            self.play = self.play.next
            return self.play.nombre

        elif (self.head is not None):
            self.play = self.head 
            return self.play.nombre
        
        else: 
            return "No hay ninguna canción."

    def play_previous(self): 

        if (self.play.previous is not None): 
            self.play = self.play.previous
            return self.play.nombre

        elif (self.head is not None):
            self.play = self.head 
            return self.play.nombre

        else: 
            return "No hay ninguna canción."

    def list_song(self): 

        lista = []
        cancion = self.head
        numero = 1
        while cancion is not None:
            lista.append(f"{numero}. {cancion.nombre}")
            cancion = cancion.next
            numero+= 1 
        return lista

    """
    def delete_node(self, key):
        curr = self.head
        prev = None
        while curr and curr.data != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
        elif curr:
            prev.next = curr.next
            curr.next = None
    """

    def playing_now(self): 
        return self.play.nombre

    # Método para imprimir la lista de nodos
    def print_list(self):

        node = self.head
        while node != None:
            print(node.data, end =" => ")
            node = node.next  


prueba = Linked()

prueba.añadir("La bebecita bebelin")
prueba.añadir("234567")
prueba.añadir("La flaca")

print(prueba.play_now())
print(prueba.play_next()) 
print(prueba.play_previous()) 
print(prueba.play_next()) 
print(prueba.play_next()) 
print(prueba.play_previous()) 
print(prueba.play_previous()) 
print(prueba.play_previous()) 
print(prueba.list_song())