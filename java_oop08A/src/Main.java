public class Main {
    public static void main(String[] args) {
        var cy1 = new Cylinder(5.5,10);
        cy1.info();
        System.out.println(cy1);
    }
}

class Circle {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * Math.pow(radius,2 );
    }
    public void  info()  {
        System.out.println("Circle [radius: " + radius + "area:" + area() +"]");
    }
}



class Cylinder extends  Circle {
    public double length;

    public Cylinder(double radius,double length) {
        super(radius);
        this.length = length;
    }

    @Override
    public double area() {
        //return 2* Math.PI *radius * (radius + length);
        return 2 * super.area() + (2 * Math.PI *radius * length);
    }
    public  double volume() {
        return super.area() * length;

    }
    @Override
    public void info() {
        System.out.println("Circle [radius: " + radius + "length:" + length + "area:" + area()+ "volume"+ volume() +"]");
    }
    @Override
    public String toString(){
        return  "Cylinder r:" + radius + "l:"+ length + "a:" + area() + "v:" + volume()+"]";
    }

}