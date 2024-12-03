package Dealer;

public class Main {
    public static void main(String[] args) {
        try {
            Dealer dealer = new Dealer();
            Player player1 = new Player();
            Player player2 = new Player();

            dealer.dealCards(player1);
            dealer.dealCards(player2);

            System.out.println("Рука первого игрока: " + player1);
            System.out.println("Рука второго игрока: " + player2);

            dealer.setupBoard();
            dealer.determineWinner(player1, player2);
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}