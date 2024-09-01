package arrays;

import java.util.Arrays;

public class LengthOfString {
    public static void main(String[] args) {
        String [] names = {"mah","ames","ma","mahesh"};
        String minlen = names[0];
        int lengthofString=0;
      //  String value="";
        int idex =0;
        for (int i=0;i<names.length;i++){
            //char each;
            if (minlen.length()>names[i].length()){
                minlen=names[i];
                idex=i;

            }
        }
        System.out.println(minlen);
        System.out.println(idex);
        System.out.println(minlen.length());
    }
}
