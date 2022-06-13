package com.company;

import com.company.Suit;
import com.company.Value;

class Card
{
    private Suit suit;
    private Value value;

    public Card(Suit aSuit, Value aValue)
    {
        this.suit = aSuit;
        this.value = aValue;
    }

    public void setSuit(Suit aSuit)
    {
        this.suit = aSuit;
    }

    public void setValue(Value aValue)
    {
        this.value = aValue;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public Value getValue()
    {
        return value;
    }

    public int getNumberValue()
    {
        int intValue = 0;
        switch (value)
        {
            case KING:
            case QUEEN:
            case JACK:
                intValue = 10;
                break;
            case ACE:
                intValue = 11;
                break;
            default:
                intValue = value.getValue();
        }
        return intValue;
    }

    public String toString()
    {
        return getValue() + " " + getSuit();
    }
}
