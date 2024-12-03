package Dealer;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> getCombinedHand(List<Card> board) { //объединяет карты: стол с руками
        List<Card> combined = new ArrayList<>(hand);
        combined.addAll(board);
        return combined;
    }

    public String toString() {
        return hand.toString();
    }
}