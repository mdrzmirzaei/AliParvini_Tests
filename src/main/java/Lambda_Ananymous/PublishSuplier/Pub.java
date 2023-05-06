package Lambda_Ananymous.PublishSuplier;

public class Pub implements Publisher{

    String message;

    public Pub(String message) {
        this.message = message;
    }

    @Override
    public void publish() {
        Supp s=new Supp();
        Supp1 s1=new Supp1();
        Supp2 s2=new Supp2(25);
        if (s instanceof Supplier) {
            s.receiver(this.message);
        }

        if (s1 instanceof Supplier) {
            s1.receiver(this.message);
        }

        if (s2 instanceof Supplier) {
            s2.receiver(this.message);
        }
        else
            System.out.println("Supp2 is not instanse of Supplier");
        System.out.println("hahahah");
    }
}
