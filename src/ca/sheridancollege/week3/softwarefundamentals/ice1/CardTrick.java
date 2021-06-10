/*
 * Jingyuan Tan
 * Student ID: 991563361
 * 
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Jingyuan Tan 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random r = new Random();
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
                  
            c.setValue(r.nextInt(14)+1);
            //c.setValue(insert call to random number generator here)
            c.setSuit(c.SUITS[r.nextInt(4)]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c ;
            
            System.out.println(magicHand[i]);
        }
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Select a card suit");
        System.out.println("1 for Hearts, 2 for Diamonds, 3 for Spades or 4 for Clubs");

        int suitNumber = input.nextInt();
        
        System.out.println("Please enter a card value between 1 and 13 :");
        
        int cardValue = input.nextInt();
      
        System.out.println("Your Card:");
        System.out.println("Suit: "+ Card.SUITS[suitNumber-1]);
        System.out.println("Value: "+ cardValue);
        // and search magicHand here
        Card player = new Card(Card.SUITS[suitNumber-1],cardValue);
        System.out.println(player);
        for (int i=0; i<magicHand.length; i++){
            if(magicHand[i].equals(player)){
            System.out.print("contain");
            }
            else{
            System.out.print("not contain");
            }
            
        //Then report the result here
        }
    }
    
}
