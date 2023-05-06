package Lambda_Ananymous;

public class TestAnanymous {


    HumanObject method(){
        return new HumanObject(){
            @Override
            public void sayhello() {
                System.out.println("alan ananymous");
            }
        };
    }

}
