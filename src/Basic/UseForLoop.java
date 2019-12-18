package Basic;

public class UseForLoop {
    public static void main(String[] args) {
        //for loop
        //for(init,termination,increment/decrement)
      //  for(int i=0; i <10; i++){
     //       System.out.println("Hello Loop");
      //  }
        //below 4loop not work bcause the condition was not satisfied i=0 which is not greater than 5
        for(int i=0; i>5; i++){
            System.out.println("Hello" +i );

        }
        for (int i=0;i<4;i++){
            System.out.println("Beginning of the phase is "+i);
            for(int j=0;j<2;j++){
                System.out.println("i = "+i+" j ="+j);
            }
            System.out.println("end of the phase is "+i+"\n"); // "\n" left new line after printing end of phase
        }
    }
}
