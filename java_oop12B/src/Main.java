public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        var std1 = new Student("John");
        var std2 = new Student("Jack");
        var std3 = std1.clone();



        System.out.println(std1.equals(std2));
        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
        System.out.println("========================================");
        std1.name ="Jane";

        System.out.println(std1);
        System.out.println(std3);

    }
}

class Student implements Cloneable {

    String name;

    public Student(String name){
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return this.name;
    }
}
