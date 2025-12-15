class Rectangle:

    def __init__(self, width:float=1.0, height:float=1.0):
        self.__width = width
        self.__height = height

    #### property width method /@annotation
    @property  ###getter
    def width(self):
        return self.__width
    
    @width.setter    ###setter
    def width(self,width:float=1.0):
        self.__width = width

    @property
    def height(self):
        return self.__height
    
    @height.setter
    def height(self,height:float=1.0):
        self.__height = height


    def area(self):
        return self.__width * self.__height
    
    def info(self):
        return f"Rect [width: {self.__width:.2f} hight: {self.__height:.2f} area: {self.area():.2f}]"
    


r1 = Rectangle(4.0,6.0)
print(r1.info())          
r1.width = 8.0            #set
print(r1.info())    
w = r1.width           #get
print(w)

h1 = Rectangle(3.0,7.0)
print(h1.info())
h1.height = 10.0
print(h1.info())
h = h1.height
print(h)