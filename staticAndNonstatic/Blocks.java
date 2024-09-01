package staticAndNonstatic;

public class Blocks {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("non static block");
    }
    public Blocks(){
        System.out.println("constrctor");
    }  // their is no static constractor

    public static void main(String[] args) {
        System.out.println("main method");
    }
}
