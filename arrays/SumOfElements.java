package arrays;

public class SumOfElements {
    public static void main(String[] args) {
int result = 0;
int[] ij = {};
        int[] arry = {1, 4, 6, 7, 8};
        for (int i =0; i<arry.length;i++){
           // result= result+arry[i];
            result+=arry[i];
        }
        System.out.println("sum of all number"+result);
    }
}