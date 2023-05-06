package IO.exercise;


public class HumanObject {
    int age;
    String name;
    String family;

    public void sayhello(){
        System.out.println("chetori ?");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public HumanObject( String name, String family, int age) {
        this.age = age;
        this.name = name;
        this.family = family;
    }
}

