package CloneTest;

public class TestClone {
    public static void main(String[] args) throws Exception{

        Sheep Shuan=new Sheep("Shuan");
        Shuan.sayMyName();

            Sheep Dolly = Shuan.clone();
            Dolly.sayMyName();

            if (Shuan.equals(Dolly))
                System.out.println("hahaahahaah");
        }




    }

