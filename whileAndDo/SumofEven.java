package whileAndDo;

public class SumofEven {

    public static void main(String[] args) {
        int result =0;
        int i = 40;
        while (i<=80){
            if (i%2==0){
                result += i;
               // System.out.println(result);
            }
            i++;
        }
        System.out.println(result);
    }
}
