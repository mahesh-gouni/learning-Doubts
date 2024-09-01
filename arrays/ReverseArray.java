package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
    boolean[] names = {true,false,false,false};
    boolean[] reces = new boolean[names.length];
        for (int i=0;i<names.length;i++){
            reces[names.length-i-1]=names[i];
        }
        System.out.println(Arrays.toString(reces));
    }
}
