package Basic;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your salary");
        double salary=input.nextDouble();
        System.out.println("My salary is :"+salary);
        //input.close();
        Scanner stName=new Scanner((System.in));
        System.out.println("Enter your Name");
        String name=stName.nextLine();
        System.out.println("student name is "+name);
        Scanner stAge= new Scanner(System.in);
        System.out.println("enter student's age");
        System.out.println("My age is :"+ stAge.next());
        input.close();
        stName.close();
        stAge.close();


    }
}
