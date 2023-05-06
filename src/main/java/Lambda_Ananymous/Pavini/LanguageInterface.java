package Lambda_Ananymous.Pavini;

@FunctionalInterface
public interface LanguageInterface {

     void sayHello();

    default void sayGoodBye(){
        System.out.println("dfjshfjk");
    };

    default void sayHowAreYou(){
        System.out.println("dfjshfjk");
    };



}
