import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> card;

    public Player(String name){
        this.name = name;
        this.card = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCard() {
        return card;
    }

    public int getCardValue(){
        return this.card.get(0).getRank().getValue();
    }

    public String getCardRank(){
        return this.card.get(0).getRank().toString();
    }

    public String getCardSuit(){
        return this.card.get(0).getSuit().toString();
    }

    public int getNumberOfCards(){
        return this.card.size();
    }

    public void addCard(Card card) {
        this.card.add(card);
    }
}
