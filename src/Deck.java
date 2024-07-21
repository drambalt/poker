import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Deck {
    public String[] suits = {"♠", "♥", "♦", "♣"};
    public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public List<Card> deck  = new ArrayList<>();
    Deck() {
        // Создание колоды карт
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
        shuffle();
    }
    void shuffle() {
        // Перемешивание колоды
        Collections.shuffle(deck, new Random());
    }
    List<Card> deal(int numCards) {
        // Раздача карт
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            hand.add(deck.remove(deck.size() - 1));
        }
        return hand;
    }
}
