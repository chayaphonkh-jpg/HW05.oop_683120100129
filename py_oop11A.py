from enum import Enum
from abc import ABC, abstractmethod
from typing import final
import final_class 

class Color(Enum):
    RED = 0
    BLACK = 1
    WHITE = 2
    PURPLE = 3
    ORANGE = 4


class Size(Enum):
    SMALL = 0
    MEDIUM = 1
    LARGE = 2
    HUGE = 3

class Animal(ABC):
    def __init__(self, color: Color, size: Size):
        self.color = color
        self.size = size

    @abstractmethod
    def sound(self):
        pass

    @abstractmethod
    def eat(self):
        pass

class Mammalian(Animal):
    def __init__(self, color: Color, size: Size):
        super().__init__(color, size)

    
    def sound(self):
        return "Generic animalsound"


    def eat(self):
        return "Mammal is eating."


class Dog(Mammalian):
    def __init__(self, color: Color, size: Size, fierce: bool):
        super().__init__(color, size)
        self.fierce = fierce

    def sound(self):
        return "Bark"

    def eat(self):
        return "Dog is eating."
    
    
    def run(self):
        return "dog is running."

    def bite(self):
        return "dog is biting."

    def bark(self):
        return "Woof Woof"

###########################################################################
@final
class ThaiRidgeback(Dog):
    def __init__(self, color: Color, size: Size, origin: str, fierce: bool, number_babies: int = 1):
        super().__init__(color, size, fierce)
        self.origin = origin

    def sound(self):
        return "loud bark"

    def eat(self):
        return "Thai Ridgeback is eating premium dog food."
    
###########################################################################################


class Puppy(ThaiRidgeback):
    pass

#
puppy = Puppy(Dog)
print(puppy.eat())
print(puppy.sound())

