public class Circle {
    private double radius;


    public Circle () {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //ตัวอย่างเสยๆ
//    public  double getRadius(){
//        return radius;
//    }
//
//    public  void setRadius(double radius){
//        this.radius = radius;
//    }



    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public  double diameter(){
        return 2 * radius;
    }

    public void circleInfo(){
        System.out.printf("Circle radius : %.2f area: %.2f diameter: %.2f circumference: %.2f",radius,diameter(),circumference(),area());
    }
}
