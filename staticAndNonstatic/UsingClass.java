package staticAndNonstatic;

import java.util.LinkedList;

public class UsingClass {
    static int j;
   // LinkedList<Integer> linkedList= new LinkedList<>(){};

    public static void main(String[] args) {
        UsingClass.j=10;
        UsingClass.j=20;
        UsingClass.j=30;
        System.out.println(UsingClass.j);
        System.out.println(UsingClass.j);
        System.out.println(UsingClass.j);
    }
}
