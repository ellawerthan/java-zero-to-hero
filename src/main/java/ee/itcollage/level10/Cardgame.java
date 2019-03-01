package ee.itcollage.level10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
           for (Suit suit : Suit.values()) {
               Card myCard = new Card(rank, suit);
               cards.add(myCard);
           }
       }
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        //todo 1 fix tests
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards)
        Cardgame myGame = new Cardgame();
        List<Card> myDeck = myGame.buildDeck();
        myDeck = myGame.shuffle(myDeck);
        List<Card> myHand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myHand.add(myDeck.get(i));
        }
        System.out.println(myHand);
    }
}
