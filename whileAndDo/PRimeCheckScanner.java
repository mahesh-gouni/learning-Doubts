package whileAndDo;

import java.util.Scanner;

public class PRimeCheckScanner {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int userinput = scanner.nextInt();

        if (userinput!=1 || userinput!=2){
            int i =2;
            while (i<userinput){

                if (userinput%i==0){
                    isPrime =false;
                    //System.out.println("given  not number is prime");
                    break;

                }
                i++;

            }
            if (isPrime==true){
                System.out.println("given number is a prime number"+userinput);
            }
            else {
                System.out.println("not prime");
            }

        }
        else {
            System.out.println( " it is not aprime unmber");
        }

    }
}
