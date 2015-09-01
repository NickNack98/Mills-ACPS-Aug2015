
/**
 * Write a description of class Exercise here.
 * 
 * @author (Nicholas Chu) 
 * @version (Version #2)
 * @purpose (To sing the twelve days of christmas in Java)
 */
public class Exercise
{
    public static void main(String[] args){
        dayOne();
        dayTwo();
        dayThree();
        dayFour();
        dayFive();
        daySix();
        daySeven();
        dayEight();
        dayNine();
        dayTen();
        dayEleven();
        dayTwelve();
    }
    public static void dayOne(){
        System.out.println("On the first day of Christmas,");
        love();
        pear();
        space();
    }
    public static void dayTwo(){
        System.out.println("On the second day of Christmas,");
        love();
        tree();
        space();
    }
    public static void dayThree(){
        System.out.println("On the third day of Christmas,");
        love();
        hen();
        space();
    }
    public static void dayFour(){
        System.out.println("On the fourth day of Christmas,");
        love();
        birds();
        space();
    }public static void dayFive(){
        System.out.println("On the fifth day of Christmas,");
        love();
        rings();
        space();
    }public static void daySix(){
        System.out.println("On the sixth day of Christmas,");
        love();
        geese();
        space();
    }public static void daySeven(){
        System.out.println("On the seventh day of Christmas,");
        love();
        swans();
        space();
    }public static void dayEight(){
        System.out.println("On the eighth day of Christmas,");
        love();
        maids();
        space();
    }public static void dayNine(){
        System.out.println("On the ninth day of Christmas,");
        love();
        ladies();
        space();
    }public static void dayTen(){
        System.out.println("On the tenth day of Christmas,");
        love();
        lords();
        space();
    }public static void dayEleven(){
        System.out.println("On the eleventh day of Christmas,");
        love();
        pipers();
        space();
    }public static void dayTwelve(){
        System.out.println("On the twelfth day of Christmas,");
        love();
        drummers();
        space();
    }
    public static void pear(){
        System.out.println("a partridge in a pear tree.");
    }
    public static void tree(){
        System.out.println("two turtle doves, and");;
        pear();
    }
    public static void hen(){
        System.out.println("three French hens,");
        tree();
    }
    public static void birds(){
        System.out.println("four calling birds");;
        hen();
    }
    public static void rings(){
        System.out.println("Five golden rings,");;
        birds();
    }
    public static void geese(){
        System.out.println("six geese a-laying,");;
        rings();
    }
    public static void swans(){
        System.out.println("seven swans a-swimming,");;
        geese();
    }
    public static void maids(){
        System.out.println("eight maids a-milking,");;
        swans();
    }
    public static void ladies(){
        System.out.println("nine ladies dancing,");;
        maids();
    }
    public static void lords(){
        System.out.println("ten lords a-leaping,");;
        ladies();
    }
    public static void pipers(){
        System.out.println("eleven pipers piping,");;
        lords();
    }
    public static void drummers(){
        System.out.println("Twelve drummers drumming");;
        pipers();
    }
    public static void love(){
        System.out.println("my true love gave to me");;
    }
    public static void space(){
        System.out.println("\n");
    }
}
