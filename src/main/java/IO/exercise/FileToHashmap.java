package IO.exercise;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileToHashmap {

    static HashMap<Integer, HumanObject> fth() {

        HashMap<Integer, HumanObject> customers = new HashMap<>();


        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Mirza\\Desktop\\Customers.txt");
            Scanner reader = new Scanner(fis);

            reader.useDelimiter(",");
            while (reader.hasNext()) {
                HumanObject ho=new HumanObject(reader.next(),reader.next(),Integer.valueOf(reader.next()));
                customers.put(ho.getAge(),ho);


            }

            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

return customers;
    }


    public static void main(String[] args) {

        HashMap<Integer, HumanObject> test=new HashMap<>();
        test=fth();

        System.out.print(test.get(25).getAge());
        System.out.print(test.get(11).getAge());
        System.out.print(test.get(36).getAge());






        for (Map.Entry<Integer,HumanObject> pp: test.entrySet()) {

            System.out.println("cos: " + pp.getValue().getAge()+ pp.getValue().getName()+pp.getValue().getFamily());


        }
    }
}
