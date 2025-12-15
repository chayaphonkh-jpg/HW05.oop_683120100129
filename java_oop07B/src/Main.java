import a.*;

public class Main {
    public static void main(String[] args) {
        var c1 = new Circle(2.5);
        c1.circleInfo();
        //var r =c1.radius;
       // c1.radius = 6.6;
        var r = c1.getRadius();
        c1.setRadius(2.5);
        c1.circleInfo();
        //access indirect

    }
}

