package expectionHandling;

public class CustomCheckExcp {
    public static void main(String[] args) throws CustomOwnExpection {

        int a= 10;
        int b= 0;
        int c;
        try {
            c=a/b;
        }
        catch (ArithmeticException customOwnExpection){
            throw new CustomOwnExpection("o amma zero rah adi");

        }

    }
}
