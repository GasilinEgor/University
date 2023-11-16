package pr4.second;

public class Tie extends Clothes implements MenClothing {
    Tie(Sizes size, int cost, String colour) {
        super(size, cost, colour);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук");
    }
}
