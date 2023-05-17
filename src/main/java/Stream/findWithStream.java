package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class findWithStream {

    List<Object> Myobj = new ArrayList<Object>();

    public void setItems() {

        Myobj.add(new Object(25, "ALIREZA MIRZAEI"));
        Myobj.add(new Object(36, "HAMID ALIDOOSTI"));
        Myobj.add(new Object(44, "ZAHRA ESLAMI"));

    }


    public void printItems() {
        System.out.println("pls enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int age;
        age = scanner.nextInt();
        scanner.nextLine();


        List<Object> objlist= Myobj.stream().filter(mo->mo.getAge()>age).collect(Collectors.toList());
        for (int i = 1; i < objlist.size(); i++) {
            System.out.println(objlist.get(i).getName()+objlist.get(i).getAge());

        }



    }
}

