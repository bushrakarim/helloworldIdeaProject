package Basic;

import java.util.ArrayList;
import java.util.List;

public class UseLoop {
    public static void main(String[] args) {
/*    //Nested Loop : loop within a loop ( child loop inside the parent loop)

    for (int i = 0;i<4; i++) {
        System.out.println("Beggining of the phase is " + i);

        for (int j = 0; j < 2; j++) {

            System.out.println("i= " + i + "j= " + j);
        }
        System.out.println("end of phase " + i + " \n");
    }
    //while Loop
       int  numberOfContestants=0;
   while (numberOfContestants<5) {
        System.out.println("The total number of contestants in this raffle are :"+ numberOfContestants);
    numberOfContestants++;
    }

//Do while
        int count=0;
        do {
            System.out.println("count is " + count);
            count++;
        }while (count<6);

 */
 // for each loop
        List<String> nameList=new ArrayList<String>();
        nameList.add("bushra");
        nameList.add("Zakir");

        System.out.println(nameList.size());

        for(String st: nameList){
            System.out.println("the length of nameList is "+st.length());
           // System.out.println((st));
        }

   }
}
