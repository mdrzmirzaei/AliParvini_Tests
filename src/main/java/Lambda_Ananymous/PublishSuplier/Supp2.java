package Lambda_Ananymous.PublishSuplier;

public class Supp2 {

    int age;
    String msq;

    public Supp2(int age) {
        this.age = age;
    }

    public void receiver(String msg) {
        this.msq=msg;
        System.out.println("S1 is " +msq);
    }
}
