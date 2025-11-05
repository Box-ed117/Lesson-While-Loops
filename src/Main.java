/**
 * Template for programs with console text output.
 * @author Your Name
 */
public class Main extends ConsoleProgram {
    @Override
    public void run() {
        //--------------------| Practice Problems |--------------------


        //---------------| #1 Count up |---------------
        // int numbers = 1; // Starting Number
        // while (numbers <= 10) { // Repeats untill...
        //    System.out.println(numbers);
        //    numbers += 1; // Increases by...
        // }

        //---------------| #2 Count Down |---------------
        // int numbers = 10; // Starting number
        // while (numbers >= 1) {
        //     System.out.println(numbers); // Repeats untill
        //     numbers -= 1; // Decreases by...
        // }
        // System.out.println("Blastoff!"); // End message

        //---------------| #3 Repeat a Phrase |---------------
        // String phrase = readLine ("Repeated phrase: "); // Asks user for phrase
        // int repeat = readInt ("Repeat how many times? "); // Asks user for number of times repeated
        // System.out.println(); // Creates a space for clairity

        // while (repeat >= 1) {
        //     System.out.println(phrase);
        //     repeat -= 1;
        // }

        //---------------| #4 Input Validation |---------------
        // int number;
        // boolean validNum = false;

        // while (validNum == false) {
        //     number = readInt ("Enter a number (1-5): ");

        //     if (number <= 5 && number >= 1) {
        //         System.out.println("//Number accepted//");
        //         System.out.println();
        //         validNum = true;
        //     } else {
        //         System.out.println("//Number rejected//");
        //     }
        // }

        //---------------| #5 Password Unlock |---------------
        boolean passwordCorrect = false;
        String passwordAttempt;
        while (passwordCorrect == false) {
            passwordAttempt = readLine ("Enter Password: ");
            if (passwordAttempt.equals("open")) { // Correct password
                System.out.println("Unlocked!");
                passwordCorrect = true;
            } else {
                System.out.println("Incorrect.");
            }
        }
    }
}
