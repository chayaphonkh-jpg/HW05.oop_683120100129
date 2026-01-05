import math

from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def info(self):
        pass

class Circle(Shape):
    def __init__(self, radius=0.0):
        self.radius = radius

    def area(self):
        return math.pi  * self.radius * self.radius

    def info(self):
        return f"Circle [r={self.radius} a={self.area():.2f}]"
    


##########################################################################
c1 = Circle(5.5)
print(c1.area())
print(c1.info())
