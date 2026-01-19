public abstract class Shape implements ShapeInterface{

}


abstract class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public abstract double getVolume();

    @Override
    public void printInfo() {
        System.out.printf("Rectangle [w: %.2f h: %.2f a:&.2f]\n",width,height,getArea());

    }
}

class Cube extends Rectangle implements ShapeInterface{
    public double length;

    public Cube(double height, double width, double length) {
        super(height, width);
        this.length = length;
    }

    @Override
    public double getVolume() {
        return getArea() * length;
    }

    @Override
    public void printInfo() {
        System.out.printf("Cube [w: %.2f  h: %.2f a: %.2f v: %.2f]\n",width,height,getArea(),getVolume());
    }
}