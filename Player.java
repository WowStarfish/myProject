package com.company;
import java.util.Random;
import java.util.*;

public class Player
{
    private List<Card> drawnCards;
    private CardDeck deck;

    public Player(CardDeck deck)
    {
        this.deck = deck;
        this.drawnCards = new ArrayList<>();
    }

    public void drawACard()
    {
        Card aDrawnCard = deck.drawCard();
        if (aDrawnCard != null)
        {
            drawnCards.add(aDrawnCard);
        }
    }

    public void displayCard()
    {
        System.out.println("You drew the card: " + drawnCards.get(drawnCards.size() - 1));
    }

    public void displayCardsDrawnSoFar()
    {
        System.out.println("Cards drawn so far:");
        for (Card eachCard : drawnCards)
        {
            System.out.println(eachCard);
        }
    }

    public int sumCardsValue()
    {
        int cardSum = 0;
        for (Card c : drawnCards)
        {
            cardSum += c.getNumberValue();
        }
        return cardSum;
    }
}