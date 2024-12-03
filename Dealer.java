package Dealer;

public class Dealer {
    private final Deck deck;
    private final PokerBoard pokerBoard;

    public Dealer() {
        deck = new Deck();
        pokerBoard = new PokerBoard();
    }

    public void dealCards(Player player) {
        for (int i = 0; i < 2; i++) {
            player.addCard(deck.drawCard());
        }
    }

    public void setupBoard() {
        for (int i = 0; i < 3; i++) {
            pokerBoard.addCard(deck.drawCard());
        }
        System.out.println("Флоп: " + "[" + pokerBoard + "]");

        Card turnCard = deck.drawCard();
        pokerBoard.addCard(turnCard);
        System.out.println("Тёрн: " + "[" + turnCard + "]");

        Card riverCard = deck.drawCard();
        pokerBoard.addCard(riverCard);
        System.out.println("Ривер: " + "[" + riverCard + "]");
    }

    public PokerBoard getPokerBoard() {
        return pokerBoard;
    }

    public void determineWinner(Player player1, Player player2) {

        int comparisonResult = PokerHandEvaluator.compareHands(player1.getCombinedHand(pokerBoard.getBoard()), player2.getCombinedHand(pokerBoard.getBoard()));
        if (comparisonResult > 0) {
            System.out.println("Победитель: Игрок 1");
        } else if (comparisonResult < 0) {
            System.out.println("Победитель: Игрок 2");
        } else {
            System.out.println("Ничья");
        }
    }
}