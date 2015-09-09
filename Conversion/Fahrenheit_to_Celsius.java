
/**
 * Conversion for degrees Fahernheit to degrees Celsius
 * 
 * @author (Nicholas Chu) 
 * @version (Version 1 9/9/15)
 */
public class Fahrenheit_to_Celsius
{
    public static void main(String[] args){
        double degreesF = 90.0;
        double degreesC = (5.0 / 9.0) * (degreesF - 32.0);
        System.out.println(degreesC);
    }
}
