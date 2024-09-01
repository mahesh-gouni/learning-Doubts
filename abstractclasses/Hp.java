package abstractclasses;

public abstract class Hp implements Lapi{   // abstract method
    @Override
    public void read() {
        System.out.println(" abstract class read");
    }

    @Override
    public void write() {
        System.out.println("abstract class write");

    }
    @Override
    public abstract void paste();

    public abstract void mahi();


}
