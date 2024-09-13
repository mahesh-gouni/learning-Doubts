package expectionHandling;

public class ExpectionHandling {
    public static void main(String[] args) throws CustomOwnExpection {


        int a = 10;
        int b = 0;
        int c;
        try {


            c = a / b;
        } catch (ArithmeticException e) {
            throw new  ArithmeticException("Yadava O tho ala divide avuthundi rah!");

        }
        System.out.println(c);
    }
}