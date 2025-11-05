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
        // while (numbers <= 10) { // Repeats until...
        //    System.out.println(numbers);
        //    numbers += 1; // Increases by...
        // }

        //---------------| #2 Count Down |---------------
        // int numbers = 10; // Starting number
        // while (numbers >= 1) {
        //     System.out.println(numbers); // Repeats until
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
        // boolean passwordCorrect = false;
        // String passwordAttempt;
        // while (passwordCorrect == false) {
        //     passwordAttempt = readLine ("Enter Password: ");
        //     if (passwordAttempt.equals("open")) { // Correct password
        //         System.out.println("Unlocked!");
        //         passwordCorrect = true;
        //     } else {
        //         System.out.println("Incorrect.");
        //     }
        // }

        //---------------| #6 Sum Until Zero |---------------
        // int addedNumber = 1;
        // int totalNumber = 0;
        // System.out.println("Enter 0 for total value");
        // System.out.println("------------------------");
        // while (addedNumber != 0) {
        //     addedNumber = readInt ("Enter a number: ");
        //     totalNumber = totalNumber + addedNumber;
        // }
        // System.out.println("Total = " + totalNumber);

        //---------------| #7 Count the Digits |---------------
        // int number;
        // int digits = 0;
        // number = readInt ("Enter a number: ");
        // while (number > 0) {
        //     number = number / 10;
        //     digits = digits + 1;
        // }
        // System.out.println("Digits: " + digits);

        //---------------| #8 Multiplication Quiz |---------------
        // int num1 = (int)random(1, 20);
        // int num2 = (int)random(1, 20);
        //erm, ze random function ain't workin' D:


        // int num1 = 2; // let's assume that these are random
        // int num2 = 3;
        // int product = num1 * num2;
        // int guess = 0;

        // while (guess != product) {
        //     guess = readInt ("What is " + num1 + " x " + num2 + "? ");
        //     if (guess == product) {
        //         System.out.println("Correct.");
        //     } else {
        //         System.out.println("Incorrect, try again.");
        //     }
        // }

        //---------------| #9 Collatz Sequence Step Counter (Challenging) |---------------
        int numInput;
        int steps = 0;

        numInput = readInt ("Enter a number: ");
        while (numInput != 1) {
            if (numInput % 2 == 0) {
                numInput = numInput / 2;
            } else {
                numInput = numInput * 3;
                numInput += 1;
            }
            steps += 1;
        }
        System.out.println("It took " + steps + " steps to reach 1.");
    }
}
