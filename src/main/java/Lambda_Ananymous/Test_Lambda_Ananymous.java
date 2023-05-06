package Lambda_Ananymous;

public class Test_Lambda_Ananymous {

    public static void main(String[] args) {
        Outer outer = new Outer(); //create outer class
        Outer.Inner inner = outer.new Inner(); //create new inner class from object of outer class



    }
}
