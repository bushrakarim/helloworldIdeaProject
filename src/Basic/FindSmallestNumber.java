package Basic;

public class FindSmallestNumber {
    public static void main(String[] args) {
        FindSmallestNumber sm= new FindSmallestNumber();
        System.out.println(sm.smallestNumber());
    }
    public int smallestNumber(){
        int number1=38;
        int number2=78;
        int number3=55;
        return  Math.min(Math.min(number1,number2),number3);

    }
}
