package CloneTest;

public class Sheep implements  Cloneable{

    public String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName(){
        System.out.println(this.name);
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {

        return (Sheep) super.clone();



    }

    public boolean equals(Sheep obj) {
        if (this.getName()==obj.getName())
            return true;
            else
                return false;
    }
}
