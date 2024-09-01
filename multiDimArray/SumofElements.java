package multiDimArray;

public class SumofElements {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 2, 3},
                {4, 5, 7},
                {8, 9, 3},
        };
        int sum = 0;
        for (int i=0; i<arr.length;i++){
            for (int j=0; j<arr.length;j++) {
                int[] argst = arr[j];
                sum += argst[j];
            }
        }
        System.out.println(sum);
    }

}