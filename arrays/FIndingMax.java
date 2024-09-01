package arrays;

public class FIndingMax {
    public static void main(String[] args) {
        int [] arr={1,2,5,9,0,7};
        int largestNum =arr[0];
        int largestNumindedx =0;

        for (int i=0;i<arr.length;i++){
           // arr[i]==
            if (largestNum<arr[i]){
                largestNum=arr[i];
                largestNumindedx=i;
            }
        }
        System.out.println(largestNum);
        System.out.println(largestNumindedx);
    }
}
