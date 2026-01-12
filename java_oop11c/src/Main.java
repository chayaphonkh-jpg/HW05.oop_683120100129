package one;


public class One{
    private void printprivate(){
        System.out.println("Private for Self");
    }

    public void printPublic(){
        System.out.println("Public for Anywhere");
    }

    protected void printProtected(){
        System.out.println("Protected for Subc");
    }
}

public class Main {
    public static void main(String[] args) {
        A a= new A();
        System.out.println(a);

    }
}