abstract class Shape{
    public void info(){
        System.out.println("Shap info");
    }
}


class Circle extends Shape{
    @Override
    public void info() {
        System.out.println("Circle info");
    }
}

class Cylinder extends Circle{
    public void info(){
        System.out.println("Cylinder info");
    }
}


public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle();
        c1.info();
        Circle c2 = new Circle();
        c2.info();
        Circle c3 = new Cylinder();
        c3.info();
        Cylinder c4 = new Cylinder();
        c4.info();


        ((Circle)c3).info();

        Circle c5 = (Circle)c4;
        c5.info();
        printStape(c1);
        printStape(c2);
        printStape((Cylinder)c3);
        double x =55555555555.5;
        int y = (int) x;
        float z = (float) y;

    }

    static void printStape(Shape s){
        s.info();

    }
}