public class Main {
    public static void main(String[] args) {
        A c1 = new C();
        B c2 = new C();
        C c3 = new C();

        var cc2 =(B) c3;
        var cc3 = (C) c2;


        var cc4 =(C) new B();



    }
}
class Studen {
    @Override
    public String toString(){
        return "I'm"+ this.getClass().getName();
    }
}

abstract  class A{
    public void aa(){
        System.out.println("method aa");
    }
    public void aaa (){
        System.out.println("method aaa");
    }
    public void info(){
        System.out.println("I'm class A");
    }
}

class B {
    public void bb(){
        System.out.println("method aa");
    }
    public void bbb (){
        System.out.println("method aaa");
    }

    @Override
    public void info(){
        System.out.println("I'm class B");
    }
}

class C extends B {
    public void cc(){
        System.out.println("method aa");
    }
    public void ccc (){
        System.out.println("method aaa");
    }
    @Override
    public void info(){
        System.out.println("I'm class C");
    }
}
class D extends C {
    public void dd(){
        System.out.println("method dd");
    }
    public void dddd (){
        System.out.println("method ddd");
    }
    @Override
    public void info(){
        System.out.println("I'm class D"+"@");
    }
}

