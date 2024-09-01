package arrays;

public class MergingArray {
    public static void main(String[] args) {
        String [] arr= { "mahi", "mani"};
        String [] arr2= { "mahi", "mani","gorre"};
        String [] arr3= new  String [5];
        arr3[0]=arr[0];
        arr3[1]=arr[1];
        arr3[2]=arr2[0];
        arr3[3]=arr2[1];
        arr3[4]=arr2[2];


        for (int i =0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

    }
}
