package Dealer;

import java.util.ArrayList;
import java.util.List;

public class PokerBoard {
    private final List<Card> board;

    public PokerBoard() {
        board = new ArrayList<>();
    }

    public void addCard(Card card) {
        board.add(card);
    }

    public List<Card> getBoard() {
        return new ArrayList<>(board);
    }

    public boolean isValid() {
        return board.size() == 5;
    }

    public String toString() { // строковое представление
        StringBuilder sb = new StringBuilder();
        for (Card card : board) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}