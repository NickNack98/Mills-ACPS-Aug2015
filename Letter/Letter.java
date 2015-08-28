
/**
 * Write a description of class Letter here.
 * 
 * @author (Nick and Gavin) 
 * @version (a version number or a date)
 */
public class Letter
{
    public static void main(String[] args){
        Mom();
        Bro();
        Friend();
    }
    public static void Mom(){
        System.out.println("Dear Mom,");
        Indent();
        Class();
        Indent();
        Money();
        System.out.println("\tLove,\n\tYour Son");
    }
    public static void Bro(){
        System.out.println("Dear Brother,");
        Indent();
        Class();
        Indent();
        Hobbies();
        System.out.println("\tSincerely\n\tYour Brother");
    }
    public static void Friend(){
        System.out.println("Dear Friend,");
        Indent();
        Hobbies();
        Indent();
        Money();
        System.out.println("\tSincerely\n\tYour Friend");
    }
    public static void Indent(){
        System.out.print("\t");
    }
    public static void Class(){
        System.out.println("So my year just started and I just got my classes in today! I was \nable to get into the Computer Science class that I was hoping to get into last year. \nOther than that I just got my basic classes that everyone has. \nSomething tells me this is going to be a fun year!");
    }
    public static void Money(){
        System.out.println("By the way I just wanted to ask if I could borrow some money to pay for some \nbook fines that I got. I just need to borrow around 50 dollars in order to \npay it off. Call me later if you can!");

    }
    public static void Hobbies(){
        System.out.println("Recently I've been getting into this cool hobby of coin collecting. \nI havent gotten many so far, but I think I'll be able to find some awesome coins soon. \nIll keep you posted if and when I find a cool one.");
    }
}
