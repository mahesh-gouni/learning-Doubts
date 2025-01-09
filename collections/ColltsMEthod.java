package collections;

import java.util.Vector;

public class ColltsMEthod {
    public static void main(String[] args) {

        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.add("one");
        v1.add("two");
        v1.add("three");
        v1.add("one");
        v1.add("one");
        v1.add("one");
        v1.add("four");
        v2.add("five");
        v2.add("six");
        v2.add("seven");
        v2.add("eight");
        v2.add("nine");
        v2.add("Ten");

//        for (int i=0; i< v2.size();i++){
//           v1.add( v2.get(i));
//
//
//       i }

      //  System.out.println(v1.add(v2));
        System.out.println(v1);
        v1.addAll(v2);
        System.out.println(v1);
        v1.remove("one");
        System.out.println(v1);
        v1.removeElement("one");
        System.out.println(v1);
        v1.set(0,"mhes");
        System.out.println(v1);
    }
}