package Lambda_Ananymous;

public class Ananymous {


//    Object method() {
//
//        class Local {//Ananymous Class
//            int digit = 15;
//            String Name = "AliReza";
//
//        }
//        Local local = new Local();
//        return local;
//    }


    Object method() {

        return new Object() { //Ananymous Class
            int digit = 15;
            String Name = "AliReza";

        };

    }
}
