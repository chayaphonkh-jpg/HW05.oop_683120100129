#########Multiple Inheritance

class Fish:
    def __init__(self,type:str='Unkhown'):
        self.type = type


    def swimming(self):
        print('Swimming in the pool!!!!')
##########################
class Bird:
    def __init__(self,breed:str="Unkhown"):
        self.dreed = breed

    def fly(self):
        print('Fly in the sky!!!!!!')

###############################
class Duck(Fish,Bird):

    def sound(self):
        print('Quack Quack!!!!!!')



d1=Duck()
d1.fly()
d1.swimming()
d1.sound()
