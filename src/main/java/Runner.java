import java.util.Scanner;

public class Runner {

    private Deck deck;
    private Player dealer;
    private Player player;
    private Boolean gameOver;

    public static void main(String[] args){
        Boolean gameOver = false;
        Deck deck = new Deck();
        deck.newGame();
        // Set up the Scanner
        Scanner scanner = new Scanner(System.in);
        // Ask player for their name
        System.out.println("What is your name, gamer? 🤓");
        // Collect players name and store it
        String playerName = scanner.nextLine();
        while (!gameOver && deck.getLength() > 1) {
            Player dealer = new Player("🤠 Dealer");
            Player player = new Player(playerName);
            // What is the Dealers card?
            deck.dealCard(dealer);
            System.out.println("The Dealers card is the " + dealer.getCardRank() + " of " + dealer.getCardSuit());
            // What is the players carD?]
            deck.dealCard(player);
            System.out.println("Your card is the " + player.getCardRank() + " of " + player.getCardSuit());
            // Who wins?
            String winner = deck.getWinner(dealer, player);
            String choice = "";
            if ( winner != null) {
                System.out.println("The winner is " + winner + " ");
                System.out.println("Go again? y/n");
                choice = scanner.nextLine();
            } else {
                System.out.println("It is a draw!");
                System.out.println("Go again? y/n");
                choice = scanner.nextLine();
            }
            if (choice.equals("n")){
                gameOver = true;
                System.out.println("Thanks for Playing!");
            } else {
                gameOver = false;
            }
        }
    }
}
