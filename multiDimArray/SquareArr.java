package multiDimArray;

import java.util.Arrays;

public class SquareArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 7},
                {8, 9, 3},
        };
        int[][] square = new int[arr.length][arr[0].length];
        int row =0;
        for (int[] bab:arr){
            int colum =0;
            for (int value:bab){
                square[row][colum]= value*value;
               colum++;
            }
            row++;
        }
        System.out.println(Arrays.deepToString(square));

    }

}
