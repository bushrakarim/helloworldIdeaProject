package Basic;

public class SingletonDemo {
    //private constructor
    private int number;
    private String name;


    private  SingletonDemo(){
        this.number=5;
        this.name="Demo";
    }
    //instance of Singleton class
    private static SingletonDemo instance=new SingletonDemo();
    public static SingletonDemo getInstance(){
        return instance;
    }
    public void doSomething(){
        System.out.println("This is doing a lot of things");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
