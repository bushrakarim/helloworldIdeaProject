package classNobject;

public class testhouse {

    public static void main(String[] args) {
        int num1 = 10;
        house myHouse = new house();
        myHouse.LivingRoom();
        myHouse.Kitchen();

        Calculator cal = new Calculator();
        int additionResult = cal.addition(10, 20);
        System.out.println(additionResult);
        int subtractionResult = cal.subtraction(100, 80);
        System.out.println(subtractionResult);

    }

}
