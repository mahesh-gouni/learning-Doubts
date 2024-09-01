package multiDimArray;

import java.util.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 7},
                {8, 9, 3},
        };
        int[][] arrys = {
                {1, 2, 3},
                {4, 5, 7},
                {8, 9, 3},
        };
        int [][] add= new int[arr.length][arr[0].length];
        int row=0;
        for (int[] j:add){
int col =0;
            for (int k:j){
             add[row][col] =arrys[row][col]+arr[row][col];
            col++;
            }
            row++;
        }
        System.out.println(Arrays.deepToString(add));
        System.out.println(row);
    }
}
