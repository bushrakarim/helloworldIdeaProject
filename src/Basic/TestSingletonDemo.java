package Basic;

public class TestSingletonDemo {
    public static void main(String[] args) {
        SingletonDemo firstInstance=SingletonDemo.getInstance();
        firstInstance.doSomething();
        firstInstance.setName("Bushra");
        String  name =firstInstance.getName();
        System.out.println(name);
    }
}
