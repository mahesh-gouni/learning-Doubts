package staticAndNonstatic;

public class SharedMemory {
    static int i;
    public static void main(String[] args) {
        SharedMemory s1 = new SharedMemory();
        s1.i= 10;
        SharedMemory s2 = new SharedMemory();
        s2.i=20;
        SharedMemory s3 = new SharedMemory();
        s3.i=30;
        System.out.println(s1.i);
        System.out.println(s2.i);
        System.out.println(s3.i);

    }
}
