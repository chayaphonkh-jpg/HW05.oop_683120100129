import math


class Circle:
    def __init__(self, radius:float=1.0):
        self.__radius = radius



    ################################# getsetter for radius #####################################
    def get_radius(self):
        return self.__radius
    
    def set_radius(self, radius:float = 1.0):
        self.__radius = radius
    ###############


    def area(self) :
        return  math.pi * self.__radius**2
    

    def diameter(self):
        return 2 * self.__radius
    

    def circumference(self):
        return 2 * math.pi * self.__radius
    

    def info(self):
        print(f"Circle [radius: {self.__radius:.2f} area: {self.area():.2f} diamater: {self.diameter()}  circumference: {self.circumference()}]")
    



########################################################################################
c1 = Circle(5.5)
c1.info()
c1.set_radius(10.0)
c1.info()
