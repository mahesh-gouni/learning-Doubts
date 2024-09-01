package whileAndDo;

public class NumberBy7 {
    public static void main(String[] args) {
        int i = 150;
        do {
            boolean e = i%7==0;
            if (e==true){
                System.out.println(i);

            }
            i++;
        }while (i<=200);

    }
}