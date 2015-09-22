
/**
 * Code for programing project number 1 chapter 2
 * 
 * Nicholas Chu 
 * Version #1 9/21/15
 */
public class Programing_Project_1
{
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) { //Repeats the loop 7 times
            for (int x = 1; x <= 7 - i; x++) { // Takes into account the amount of lines to determine the amount of stars
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= i; spaces++) { // Prints spaces = to the line number 
                System.out.print(" ");
            }
            for (int forward = 1; forward <= 14 - (2*i); forward++) { // Slashes equal to 14 - two times the line number
                System.out.print("/");
            }
            for (int backward = 1; backward <= (2*i) - 2; backward++) { //Back slashes equal to two times the amount of lines - 2
                System.out.print("\\");
            }
            for (int spaces = 1; spaces <= i; spaces++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= 7 - i; x++) {
                System.out.print("*");
            }
            System.out.println(); // Sets a new line each time one is done
        }
    }
}
