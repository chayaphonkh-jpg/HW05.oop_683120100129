public class Main {
    public static void main(String[] args) {
        var h1 = new House("Europe Style");
        House.Bedroom b1 = h1.new Bedroom(2);
        var k1 = h1.new Kitchen(true);
        House.Kitchen.Carbinet c1 = h1.new Kitchen(true).new Carbinet("TOYOTA");
        h1.houseInfo();
        b1.bedroomInfo();
        k1.kitchenInfo();
        c1.carbinetya();
        new House("Thai Modern").new Kitchen(true).new Carbinet("Sarakham Furniture")
        A.B.printB();
    }
}
class A{
    static class B{
        static void printB(){
            System.out.println("Hello B");
        }
    }
}

// Learning Inner Class ,nested Class

class House{
    String model;

    public House(String model) {
        this.model = model;
    }

    public void  houseInfo(){
        System.out.println("House model : " + model);

    }
    public class Bedroom{
        int room;

        public Bedroom(int room) {
            this.room = room;
        }
        public void bedroomInfo(int room){
            System.out.println("Bedroom :"+ bedroom);
        }

    }

    public  class Kitchen{
        boolean kitchenware;

        public Kitchen(boolean kitchenware) {
            this.kitchenware = kitchenware;
        }

        public  void  kitchenInfo(){
            System.out.println("Kitchenware :"+ kitchenware);


        }
    public  class Carbinet{
        tring Carbinetya;

        public Carbinet(String carbinetya) {

            this.Carbinetya = carbinetya;


        }
        public void carbinetInfo(){
            System.out.println("Carbinet :"+ carbinetya);
        }
        

    }
}