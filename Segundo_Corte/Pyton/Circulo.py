class Circulo:
    pi= 3.14

    def __init__(self,diameter):
         self.radius=diameter/2

    def area (self):
         return self.pi*self.radius ** 2

    def perimeter(self):
        return self.pi*2 *self.radius

    

media_pizza=Circulo(12)
print("Area media pizza:",media_pizza.area())
print("perimetro media pizza:",media_pizza.perimeter())
lote=Circulo(10)
print("Area lote:",lote.area())
print("perimetro lote:",lote.perimeter())
    
