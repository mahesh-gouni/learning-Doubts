package encapsulation;

public class Student {
    private int rollno;
    private String name;
    private boolean  isPresent;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public Student (int rollno, String name, boolean isPresent){
        this.rollno=rollno;
        this.name=name;
        this.isPresent=isPresent;

    }
}
