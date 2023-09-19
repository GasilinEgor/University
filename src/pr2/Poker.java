package pr2;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        Card[] cards = generate();
        Scanner scanner = new Scanner(System.in);
       shuffle(cards);
       System.out.print("Введите количество участников: ");
       int n = scanner.nextInt();
       if (n < 2 || n > 6) {
           System.out.println("Введено ошибочное количество участников!");
       }
       else {
           Card[][] cards1 = new Card[n][5];
           for (int i = 0; i < n; i++) {
               cards1[i] = give(cards);
               cards = delete(cards);
               System.out.println("Карты игрока " + (i + 1));
               for (int j = 0; j < 5; j++) {
                   cards1[i][j].print();
               }
               System.out.println();
           }
       }
    }


    public static Card[] generate() {
        Card[] cards = new Card[52];
        int count = 0;
        String[] suits = {"spades", "clubs", "diamonds", "hearts"};
        String[] types = {"two", "tree", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < types.length; j++) {
                cards[count] = new Card(suits[i], types[j]);
                count++;
            }
        }
        return cards;
    }


    public static void shuffle(Card[] cards) {
        Random random = new Random();
        int counts = random.nextInt(20, 40);
        for (int i = 0; i < counts; i++) {
            int change = random.nextInt(5, cards.length / 2);
            if (random.nextInt(1, 2) % 2 == 0) {
                for (int j = 0; j < change; j++) {
                    swap(cards, j, random.nextInt(j, cards.length) / 2);
                }
            }
            else {
                for (int j = cards.length - 1; j > cards.length - change; j--) {
                    swap(cards, j, random.nextInt(0, j));
                }
            }
        }
    }


    public static void swap(Card[] cards, int index1, int index2) {
        Card card = cards[index1];
        cards[index1] = cards[index2];
        cards[index2] = card;
    }


    public static Card[] give(Card[] cards) {
        int i = 0;
        Card[] cards1 = new Card[5];
        while (i < 5) {
            cards1[i] = cards[cards.length - 1 - i];
            i++;
        }
        return cards1;
    }


    public static Card[] delete(Card[] cards) {
        Card[] cards1 = new Card[cards.length - 5];
        for (int i = 0; i < cards1.length; i++) {
            cards1[i] = cards[i];
        }
        return cards1;
    }
}


class Card {
    private String suit;
    private String type;


    Card() {
        this.suit = "";
        this.type = "";
    }


    Card(String suit, String type) {
        this.suit = suit;
        this.type = type;
    }


    public String getSuit() {
        return suit;
    }


    public String getType() {
        return type;
    }


    public void setSuit(String suit) {
        this.suit = suit;
    }


    public void setType(String type) {
        this.type = type;
    }


    public void print() {
        System.out.println(getSuit() + " " + getType());
    }


    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
