abstract class A{}

abstract class B extends A {}


sealed class C extends B permits D,X {}

non-sealed class D extends C{}

class E extends D{}

final class X extends C{}







abstract class Animal{
    public abstract void sound();
    public abstract void eat();
}

class Mamalia extends Animal {

    @Override
    public void sound() {
        System.out.println("Mammalia Sound!!!!!!!!!!!!!");
    }

    @Override
    public void eat() {
        System.out.println("Mammalia Eating!!!!!!!!!!");
    }

    public final void run(){
        System.out.println("Mammalia Running");
    }

}
final class Dog extends Mammalia {
    //final double G = 9.8;
    //public void run(){}
}

class ThaiRidgeBack extends Dog {}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }
}

