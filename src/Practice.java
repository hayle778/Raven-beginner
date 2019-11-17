import javax.print.MultiDocPrintService;
import javax.swing.*;
import javax.swing.text.StringContent;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice {

    //   private static void StringContent;

    public static void main(String[] args) {
   /* Good day. What is your problem? Enter your response here or Q to quit: my teacher hates me
    my teacher hates me
    Enter your response here or Q to quit: i dont know what's wrong
    i don't know what's wrong
    Enter your response here or Q to quit: i am feeling great
    i am feeling great
*/

        Scanner input = new Scanner(System.in);
        //    Scanner input2 = new Scanner(System.in);
        //    Scanner input3 = new Scanner(System.in);
        System.out.println("hello, what`s your name?");
        String object = input.nextLine();

        boolean keepgoing = true;
        boolean quit = false;


        while (!quit) {
            if (quit = keepgoing) {
                System.out.println("conversation between raven and user:  press Q to quit"+ quit());
                keepgoing = input.hasNextLine();
                quit = true;
            }


            //  Scanner input3 = null;
            //  Scanner input2 = null;
            //  Scanner input1 = null;

            // boolean keepgoing = true;

            // String keep1 ="keep";
            boolean keepgoing1 = true;
            if (keepgoing1) {

                System.out.println("What`s your problem?:");
                String keepgoing0 = input.nextLine();
            }

            boolean keepgoing2 = true;

            if (keepgoing2) {
                System.out.println("Why?");
                String keepgoing3 = input.nextLine();
            }
            boolean keepgoing3 = true;

            if (keepgoing3) {
                System.out.println("How do you feel now?");
                String keepgoing4 = input.nextLine();
            }
            //  }
//  String Keepgoing3 = "";

//     else if() {
//  System.out.println("What else:");

//    conversation 3 = input3.nextLine();
        }
        // String demo = "";

        //    for(String demox : Icon String ){


        //  for(String m:  )


        System.out.println("................PAGE.............");

        for (String x: args) {

            System.out.println(x);
        }
    }

}



















