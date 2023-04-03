//This program was made by Alenna for the CTE course "Software & Programming Development 2" instructed by Mr. Gross
//Email - alenna.castaneda@oneidaihla.org

//importing required classes
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //creating stack & queue objects
        Queue queue = new Queue();
        Stack stack = new Stack();
        //creating attribute
        boolean moreIn = true;
        //creating scanner object that reads from system.in
        Scanner inScan = new Scanner(System.in);

        //looping while moreIn = true
        while (moreIn == true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Please enter a number to add to the list. Enter -1 to stop.");
            try {
                //getting ticket from user input
                int ticket = inScan.nextInt();
                //consuming leftover line
                inScan.nextLine();
                //if ticket is -1
                if (ticket == -1) {
                    //updating var
                    moreIn = false;
                //ticket is not -1
                } else {
                    System.out.println();
                    //adding ticket to queue
                    queue.enQueue(ticket);
                    System.out.println();
                    //adding ticket to stack
                    stack.push(ticket);
                    System.out.println();
                }
            //catching input mismatch (eg. letters instead of numbers)
            } catch (InputMismatchException i) {
                System.out.println();
                System.out.println("-==-Error-==-");
                System.out.println("Please input a whole number.");
                System.out.println();
                //consuming leftover line
                inScan.nextLine();
            }
        }
        //closing scanner
        inScan.close();

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Removing numbers from queue");
        System.out.println("----------------------------------------------------");

        //looping until queue is empty
        while (queue.isEmpty() == false) {
            System.out.println();
            //removing numbers from queue
            queue.deQueue();
        }

        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Removing numbers from stack");
        System.out.println("----------------------------------------------------");
       
        //looping until stack is empty
        while (stack.isEmpty() == false) {
            System.out.println();
            //removing numbers from stack
            stack.pop();
        }
    }
}