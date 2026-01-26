
void main(List<String> arguments) {
  var puppy = Dog();
  puppy.sound();
  puppy.eat();
  puppy.info();
}

mixin Animal{
  void sound();
  void eat();

  void info(){
    print('this is an Animal');
  }
}

mixin Mamalia {
  void feed() ;
    
}

class Dog with Animal, Mamalia {
  @override
  void sound() {
    print('Woof Woof');
  }

  @override
  void eat() {
    print('Dog is eating');
  }

  @override
  void info() {
    print('This is a Dog');
  }
  
  @override
  void feed() {
    print('Dog is feeding its puppies');
  }

}


class A{}
class B{}
class X{}
class C extends A implements B,X {}