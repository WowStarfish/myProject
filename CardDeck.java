package com.company;

import java.util.List;

public class CardDeck
{
    private List<Card> deck;
    private final int TAKE_A_CARD_FROM_THE_TOP = 0;

    public CardDeck(List<Card> deck)
    {
        this.deck = deck;
    }

    public Card drawCard()
    {
        if (size() > 0)
        {
            return deck.remove(TAKE_A_CARD_FROM_THE_TOP);
        }
        return null;
    }

    public int size()
    {
        return deck.size();
    }

    public void displayRemainingCardsInDeck()
    {
        System.out.println("The following cards are remaining in the deck: ");
        for(Card eachCardInDeck : deck)
        {
            System.out.println(eachCardInDeck);
        }
    }

}
