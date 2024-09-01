package methodsMa;

public class Banking {


    // gretting
    //deposit
    //withdraal
    //show curen
    // t balance
  public    static int  balance=0;
     double creditScore =735.6;
    public static void greeting(){
        System.out.println("hello developer");

    }
    public int  deposit(int amount){
        balance = balance+amount;
        System.out.println(balance);
        System.out.println(creditScore);// we can call non static varible(instance varible)&
        // non saticic method in non static method

        return balance;

    }
    int withdral( int amount){
        if (amount<=balance) {
            balance = balance-amount;

        }
        else {
            System.out.println("insufficient balance");
        }
        return balance;
    }
    public void showcurrentbalance(){

        int currentBalance =balance;
        System.out.println("your current balance="+currentBalance);

    }

    public static void main(String[] args) {
        Banking banking= new Banking(); // we cant call non static method in static method
        greeting();
        banking.deposit(2000);
        banking.withdral(1000);
        banking.showcurrentbalance();
        new Banking().deposit(60000);
        System.out.println(banking.creditScore);

    }
}
