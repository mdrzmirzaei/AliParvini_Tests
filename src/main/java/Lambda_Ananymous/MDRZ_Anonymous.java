package Lambda_Ananymous;
import java.util.Arrays;
import java.util.Comparator;

public class MDRZ_Anonymous {

    public static void main(String[] args) {
        HumanObject h1=new HumanObject();
        h1.setAge(50);

        HumanObject h2=new HumanObject();
        h2.setAge(30);


        HumanObject h3=new HumanObject();
        h3.setAge(70);

        HumanObject[] ArrayHuman= {h1,h2,h3};


        Arrays.sort(ArrayHuman, new Comparator<HumanObject>() {public int compare (HumanObject h1,HumanObject h2) {
            return h1.getAge() - h2.getAge();
        }
        } );
    }





}
