package pr24.first;

import pr24.first.Chairs.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        Chair chair1 = ChairFactory.getChair(new VictorianChairFactory());
        Chair chair2 = ChairFactory.getChair(new MagicalChairFactory());
        Chair chair3 = ChairFactory.getChair(new MultifunctionalChairFactory());
        client1.sit(chair1);
        client2.sit(chair2);
        client3.sit(chair3);
    }
}
