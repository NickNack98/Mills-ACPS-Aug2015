/**
 * Write a description of class Hourglass_drawing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hourglass_drawing
{
    public static void main(String[] args){
        drawLine();
        drawUpTri();
        drawMid();
        drawDownTri();
        drawLine();
    }
    public static void drawLine() {
        System.out.print("|");
        for (int i = 1; i <= 10; i++) { //prints 10 quotation marks filling up the first row
            System.out.print("\"");
        }
        System.out.println("|"); 
    }
    public static void drawUpTri() {
        int j = 8; // Variable for the amount of starting stars
        for (int i = 1; i <= 4; i++) { // Goes through the loops 4 times
            for (int s = 1; s <= i; s++) { // Prints out as many spaces as the line number
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k = j; k >= 1; k--) { // Uses starting variable to figure out how many : to put
                System.out.print(":");
            }
            j -= 2; // Decrements the : counter by 2
            System.out.println("/");
        }
    }
    public static void drawMid() {
        System.out.println("     ||");
    }
    public static void drawDownTri(){
        int j = 6; // Variable for the amount of starting stars
        for (int i = 1; i <= 4; i++) { 
            for (int s = 4; s >= i; s--) { 
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k = j; k < 8; k++) { // Uses starting variable to figure out how many : to put
                System.out.print(":");
            }
            j -= 2; // Decrements the : counter by 2
            System.out.println("\\");
        }
    }
}