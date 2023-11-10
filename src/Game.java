import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Today is Monday, the closing day of the Louvre. The sun sets in the west, and the golden sunset shines on the huge glass pyramid in " +
                "front of the Louvre. Although you have seen this beautiful scene many times, the sunset still" +
                " makes you deeply addicted every time.  While you were immersed in the scenery, " +
                "you received a message on your phone...");


        while (true) { // Start an infinite loop
        //System.out.println("Enter 'yes' to get a congratulatory message, or anything else to try again:");
        String inputA = scanner.nextLine(); // Read user input

        if (inputA.contains("read")) { // Check if user input contains "read" (case insensitive)
            System.out.println("Someone has set a fire in the Mona Lisa's venue, and the fire is spreading." +
                    "Do not doubt and there is no time to doubt, you have been chosen, and your mission is to save the most precious thing."); // Print message
            System.out.println("Hit any key to continue");
            break; // Break the loop if the user entered "read"
        } else {
            System.out.println("While you were immersed in the scenery, you received a message on your phone..."); // Ask to re-enter if input is not "read"
            // The loop will continue, allowing the user to input again
        }
    }

        while (true) { // Start an infinite loop
            //System.out.println("Enter 'yes' to get a congratulatory message, or anything else to try again:");
            String inputB = scanner.nextLine(); // Read user input

            if (inputB != null) { // Check if user input contains "read" (case insensitive)
                System.out.println("the password for Louvre entry has been changed, if you want to know the password, read this carefully."); // Print message
                System.out.println("I collected treasures from the past, but they were not mine; I showed the stories of the world, " +
                        "but never left my room. You can travel to ancient times with me, but I am always in the present. May I ask who I am?");
                break; // Break the loop if the user entered "read"
            }
        }

        while(true){
            String inputC = scanner.nextLine(); // Read user input

            if(inputC.toLowerCase().equals("museum")){
                System.out.println("now you know the password to enter Louvre. and you immediately go to the entry of the museum, there are 3 wings in Louvre: Sully Denon and Richelieu. Remember, only if you enter the right room can you save the most precious good.");
                break;
            }else{
                System.out.println("I am right in front of your eyes, may I ask who I am?");
            }

        }

        while(true){
            String inputD = scanner.nextLine(); // Read user input

            if(inputD.toLowerCase().equals("denon")){
                System.out.println("Now you have entered the Denon Hall and walked straight into the corridor filled with ancient Greek sculptures. " +
                        "On your right is the statue of Venus with a broken arm. She is at the end of the corridor,facing the corridor and " +
                        " quietly overlooking the countless worldly people passing by.");
                break;
            }else{
                System.out.println("Remember, only if you enter the right room can you save the most precious thing in the world.");
            }

        }



       // scanner.close(); // Close the scanner
    }
}


