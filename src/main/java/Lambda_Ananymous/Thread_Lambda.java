package Lambda_Ananymous;

public class Thread_Lambda {

    public static void main(String[] args) {

        new Thread(() -> action()).start();

        new Thread(Thread_Lambda::action).start();

    }


    static void action() {
        System.out.println(Thread.currentThread().getName());
    }


}
