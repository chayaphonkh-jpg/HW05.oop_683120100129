import math




class Circle:

    def __init__(self,radius:float=1.0):
        self.radius = radius

    def area(self):
        return math.pi * self.radius**2
    

    def info(self):
        print(f"Circle [radius : {self.radius} area: {self.area()}]")

######################################################
class Cylinder(Circle):
    
    def __init__(self, radius:float = 1.0,length:float=1.0):
        super().__init__(radius)
        self.length = length


    def area(self):
        return 2 * math.pi * self.radius *(self.radius + self.length)
    

    def volume(self):
        return super().area() * self.length
    

    def info(self):
        print(f"Cylinder [radius : {self.radius} length: {self.length} area: {self.area()} volume: {self.volume}]")

    def __str__(self):
        return f"Cylinder r : {self.radius} l: {self.length} a: {self.area()} v: {self.volume}]"
    

cy1 = Cylinder(5.5,10)
cy1.info
print(cy1)