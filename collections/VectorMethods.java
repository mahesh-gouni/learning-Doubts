package collections;

import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {


        Vector v1 = new Vector();
        v1.add("mahi");
        //v1.add("mahi");
        v1.add("m");
        v1.add("a");
        v1.add("h");
        v1.add("i");
        v1.add("mahi");
        v1.add("ee");
        v1.add("s");
        v1.add(1);
        System.out.println(v1);
        System.out.println( v1.get(3));
        System.out.println(v1.remove("mahi"));
        System.out.println(v1.remove(6));
    //   v1.clear();
        System.out.println(v1);
        System.out.println(v1.remove(Integer.valueOf(1)));
        System.out.println(v1);
        v1.add("mahi");
        System.out.println( v1.contains("ee"));
        System.out.println( v1.contains("mahi"));
        System.out.println(v1.containsAll(v1));
        System.out.println(v1.indexOf("mahi"));
        System.out.println(v1.lastIndexOf("mahi"));

    }

}
