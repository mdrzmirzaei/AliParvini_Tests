package Lambda_Ananymous.PublishSuplier;

public class Supp implements Supplier{
    String msq;
    @Override
    public void receiver(String msg) {
        this.msq=msg;
        System.out.println("S is " + msq);
    }
}
