
/**
 * Write a description of class Letter here.
 * 
 * @author (Nick and Gavin) 
 * @version (Version 2)
 * @purpose (To make a letter using the same paragraphs for different people depending on the relationship
 */
public class Letter
{
    public static void main(String[] args){
        momLet();
        broLet();
        friendLet();
    }
    public static void momLet(){
        System.out.println("Dear Mom,");
        classPara();
        moneyPara();
        System.out.println("\tLove,\n\tYour Son");
    }
    public static void broLet(){
        System.out.println("Dear Brother,");
        classPara();
        hobbiesPara();
        System.out.println("\tSincerely\n\tYour Brother");
    }
    public static void friendLet(){
        System.out.println("Dear Friend,");
        hobbiesPara();
        moneyPara();
        System.out.println("\tSincerely\n\tYour Friend");
    }
    public static void classPara(){
        System.out.println("\tSo my year just started and I just got my classes in today! I was \nable to get into the Computer Science class that I was hoping to get into last year. \nOther than that I just got my basic classes that everyone has. \nSomething tells me this is going to be a fun year!");
    }
    public static void moneyPara(){
        System.out.println("\tBy the way I just wanted to ask if I could borrow some money to pay for some \nbook fines that I got. I just need to borrow around 50 dollars in order to \npay it off. Call me later if you can!");

    }
    public static void hobbiesPara(){
        System.out.println("\tRecently I've been getting into this cool hobby of coin collecting. \nI havent gotten many so far, but I think I'll be able to find some awesome coins soon. \nIll keep you posted if and when I find a cool one.");
    }
}
