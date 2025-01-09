package collections;

import java.util.Arrays;
import java.util.Vector;

public class ExtraMehtod {
    public static void main(String[] args) {


    Object [] obj = new Object[] { 1,5,5,6,6};
 int [ ] ad= { 1,4,6,7,8};
        Vector vek = new Vector<>(Arrays.asList(obj));
        System.out.println(vek);
        Vector vector = new Vector();
        vector.add(3);
        vector.add(3);
        vector.add(3);
       Object [] onj= vector.toArray();
        System.out.println(Arrays.toString(onj));

}}
