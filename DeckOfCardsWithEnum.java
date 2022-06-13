package com.company;

public class DeckOfCardsWithEnum {
    public static void main (String[] args) {
        CardDeckBuilder cdb = new CardDeckBuilder();
        CardDeck deck = new CardDeck(cdb.createAndShuffleDeck());
        System.out.println("deck size at start:" + deck.size());
        Player p1 = new Player(deck);
        Player p2 = new Player(deck);

        while((p1.sumCardsValue() <= 17) || (p2.sumCardsValue() <= 17)) {
           p1.drawACard();
           p2.drawACard();
        }
        
        if ((p1.sumCardsValue() == 21) || (p2.sumCardsValue() == 21)) {
           if (p1.sumCardsValue() ==21) {
               System.out.println("P1 you win. sum: " + p1.sumCardsValue());
           }else{
              System.out.println("P2 you win. sum: "  + p2.sumCardsValue());
           }
        }else if ((p1.sumCardsValue() > 21) || (p2.sumCardsValue() > 21) {
            if ((p1.sumCardsValue() > 21) && (p2.sumCardsValue() > 21))
               System.out.println("you both lose. sum p1 : " + p1.sumCardsValue() + " sum p2 : " + p2.sumCardsValue());
            }else if (p1.sumCardsValue() > 21) 
               System.out.println("p2 you win: " + p2.sumCardsValue() + " sum p1 : " + p1.sumCardsValue()); 
            }else{
               System.out.println("p1 you win: " + p1.sumCardsValue() + " sum p2 : " + p2.sumCardsValue());
            }
        }else if (p1.sumCardsValue() > (p2.sumCardsValue()) {
           System.out.println("p1 you win: " + p1.sumCardsValue() + " sum p2 : " + p2.sumCardsValue());
        }else{
           System.out.println("p2 you win: " + p2.sumCardsValue() + " sum p1 : " + p1.sumCardsValue());    
        }
        
        p1.displayCardsDrawnSoFar();

        p2.displayCardsDrawnSoFar();

        System.out.println("deck size: " + deck.size());

    }
}
