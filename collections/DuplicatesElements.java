package collections;

import arrays.SumOfElements;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesElements {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();
        HashSet m = new HashSet();

     //   HashSet g = new HashSet();
        for (int i = 1; i <=50; i++) {
            a.add(i);


        }
        for (int i = 1; i <=25; i++) {

            b.add(i);

        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {


                if (a.indexOf(i) == b.indexOf(j)) c.add(b.get(i));
            }

        }
     //   m.addAll(a);
      //  System.out.println(m);
    //    m.retainAll(b);
    //    System.out.println(m);
      //  System.out.println(a);
       // System.out.println(b);
        System.out.println(c);
    }


}
