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
        int numbers = 10; // Starting number
        while (numbers >= 1) {
            System.out.println(numbers); // Repeats untill
            numbers -= 1; // Decreases by...
        }
        System.out.println("Blastoff!"); // End message
    }
}
