package variables;

import methodsMa.Banking;

public class Stats {
    public int i =10;
    public static int in=10;
    private int igf =10;
    int gh = 10; //indirectly it a default AM
    protected  String abc;


    public static void main(String[] args) {
        Stats stats = new Stats();
        int j= Stats.in;
        int jk =stats.gh;
        int jnk =stats.igf;
        String ghu = stats.abc;
        ghu="mahi";
        System.out.println(j);
        System.out.println(jk);
        System.out.println(jnk);
        System.out.println(ghu);
        System.out.println();
    }
}
