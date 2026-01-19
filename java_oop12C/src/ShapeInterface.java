public interface ShapeInterface {
    double G = 9.0;
    double getArea();
    void printInfo();
    default void someThing(){
        System.out.println("Hello Shape");

    }
}
