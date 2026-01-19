public class Main {
    public static void main(String[] args) {
        var cube1 = new Cube(2.2,2.2,2.2);
        cube1.printInfo();
        System.out.println(cube1 instanceof Cube);
        System.out.println(cube1 instanceof Rectangle);
        System.out.println(cube1 instanceof Shape);
        System.out.println(cube1 instanceof Object);
    }
}

interface IOne {
    void methodOne();

}

interface ITwo{
    void methodTwo();
}