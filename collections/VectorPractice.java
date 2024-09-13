package collections;

import java.util.*;

public class VectorPractice {
    public static void main(String[] args) {


        Vector v0 = new Vector();
        System.out.println(v0);
        System.out.println(v0.capacity());
        v0.add(1);
        System.out.println(v0);
        v0.add(3);
        v0.add(4);
        v0.add(5);
        v0.add(9);
        v0.add(2,3);
        v0.add(7);
        v0.add(7);
        System.out.println(v0.size());
        v0.add(7);
        v0.add(7);
        System.out.println(v0);
        System.out.println(v0.capacity());

        v0.add(7);
        v0.add(7);
        System.out.println(v0);
        System.out.println(v0.capacity());


    }
}
