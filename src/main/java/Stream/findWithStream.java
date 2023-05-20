package Stream;

import org.apache.poi.ss.formula.ptg.MemAreaPtg;

import java.util.*;
import java.util.stream.Collectors;

public class findWithStream {

    List<Object> Myobj = new ArrayList<Object>();

    public void setItems() {

        Myobj.add(new Object(25, "ALIREZA MIRZAEI"));
        Myobj.add(new Object(36, "HAMID ALIDOOSTI"));
        Myobj.add(new Object(44, "ZAHRA ESLAMI"));

    }


    public void printItems() {

     /*   System.out.println("pls enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int age;
        age = scanner.nextInt();
        scanner.nextLine();

        Myobj.stream().filter(mo -> mo.getAge()==age).forEach(po-> System.out.println(po.getName()));

      */


        System.out.println("method chaining");
        int totalAge=Myobj.stream().map(men -> men.getAge()).reduce(0,Integer::sum);
        System.out.println(totalAge);

        System.out.println("sum_price");
        int totalAge1=Myobj.stream().map(men -> men.getAge()).reduce(0,(sum,price)->sum+price);
        System.out.println(totalAge1);

        System.out.println("locator");
        int totalAge2=Myobj.stream().collect(Collectors.summingInt(men->men.getAge())) ;
        System.out.println(totalAge1);

        Object max=Myobj.stream().max((men1,men2) -> men1.getAge()> men2.getAge() ? 1:-1).get();
        System.out.println("maximum of age's :  "+max.getAge());

        Object min=Myobj.stream().min((men1,men2) -> men1.getAge()> men2.getAge() ? 1:-1).get();
        System.out.println("minimum of age's :  "+min.getAge());


        System.out.println("count of all objects are : "+Myobj.stream().count());



        Set<Object> objects =Myobj.stream().collect(Collectors.toSet());



        objects.stream().filter(mo->mo.getAge()==25).forEach(mo-> System.out.println(mo.getName()+"    AGE IS ALSO "+ mo.getAge()));

        Map<Integer,String> mmm=this.Myobj.stream().collect(Collectors.toMap(p->p.getAge(),p->p.getName()));

        System.out.println(mmm);





        /*
        List<Object> objlist= Myobj.stream().filter(mo->mo.getAge()>age).collect(Collectors.toList());


        for (int i = 0; i < objlist.size(); i++) {

            System.out.println(objlist.get(i).getName()+"    and age is : "+objlist.get(i).getAge());

        }



         */

    }
}

