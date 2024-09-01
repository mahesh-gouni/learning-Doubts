package inheritance;

public class MAhesh extends  Brother{
    void  delevop(){
super.write();                                             // to give priority for parent method not for local
        System.out.println(" i can develop");
    }
    void  write(){
        System.out.println("write from devedlper");
    }



    public static void main(String[] args) {
        MAhesh mAhesh = new MAhesh();
        mAhesh.read();

        mAhesh.write();
        mAhesh.manage();
        mAhesh.delevop();

    }

}
