public class Singleton {
    private int value;

    static private Singleton instance =new Singleton();

    public Singleton() {
    }

    public Singleton getInstance(){
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
