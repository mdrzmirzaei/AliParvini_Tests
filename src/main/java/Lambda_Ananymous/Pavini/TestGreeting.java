package Lambda_Ananymous.Pavini;

public class TestGreeting {
    public static void main(String[] args) {
        Greeting G=new Greeting();

        G.doGreeting(new LanguageInterface() {
            @Override
            public void sayHello() {
                System.out.println("Sallam");
            }
        });

        G.doGreeting(new LanguageInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hallo");
            }
        });

        G.doGreeting(()-> {
            System.out.println("kayfa halak");
            System.out.println("anta my love");

        });

LI_Test li=new LI_Test();
li.sayGoodBye();
li.sayHello();
            }
}
