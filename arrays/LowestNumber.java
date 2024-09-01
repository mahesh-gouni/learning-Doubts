package arrays;

public class LowestNumber {
    public static void main(String[] args) {
        int [] arry =  { 5,32,5,6,2,6};
        int lowestNumber=arry[0];
        int idex_of =0;
        for (int i =0; i<arry.length; i++){
            if (lowestNumber>arry[i]){
                lowestNumber=arry[i];
                idex_of=i;

            }

            }
        System.out.println("lowest number"+lowestNumber);
        System.out.println("idex of l  "+idex_of);

    }

    }
