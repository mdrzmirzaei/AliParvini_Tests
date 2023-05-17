package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findWithoutStream {
List<Object> Myobj = new ArrayList<Object>();

public void setItems(){

    Myobj.add(new Object(25,"ALIREZA MIRZAEI"));
    Myobj.add(new Object(36,"HAMID ALIDOOSTI" ));
    Myobj.add(new Object(44,"ZAHRA ESLAMI" ));

}

public void printItems(){
    System.out.println("pls enter your age : ");
    Scanner scanner= new Scanner(System.in);
    int age;
    age= scanner.nextInt();
    scanner.nextLine();
    for (Object obj:this.Myobj) {

        if (obj.getAge()>age) {

            System.out.println(obj.getAge());
            System.out.println(obj.getName());
        }

    }

}





}
