import java.util.Stack;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void info(){
        System.out.println("circle [r=" + radius + "a=" + area());
        var obj = new Stack<>();
    }
}

