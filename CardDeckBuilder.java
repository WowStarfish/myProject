package com.company;

import com.company.Card;
import com.company.Suit;
import com.company.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CardDeckBuilder
{
    public List<Card> createAndShuffleDeck()
    {
        List<Card> deck = createCardDeck();
        Collections.shuffle(deck);
        return deck;
    }

    public List<Card> createCardDeck()
    {
        List<Card> deck = new ArrayList<>();
        for (Suit s : Suit.values())
        {
            for (Value v : Value.values())
            {
                deck.add(new Card(s,v));
            }
        }
        return deck;
    }
}
