package arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double results = 0;
        int resul =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number1 = scanner.nextInt();
        System.out.println("enter a number");
        int number2 = scanner.nextInt();
        System.out.println("enter a number");
        int number3 = scanner.nextInt();
        System.out.println("enter a number");
        int number4 = scanner.nextInt();
        System.out.println("enter a number");
        int number5 = scanner.nextInt();
        int [] avg;
        avg= new int[5];
        avg[0]=number1;
        avg[1]=number2;
        avg[2]=number3;
        avg[3]=number4;
        avg[4]=number5;
        for (int i =0;i<avg.length;i++){

           resul= resul+ avg[i];



        }
        results =  resul/ avg.length;
        System.out.println(results);

    }
}