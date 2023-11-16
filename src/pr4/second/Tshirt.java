package pr4.second;

public class Tshirt extends Clothes implements MenClothing, WomenClothing {
    public Tshirt (Sizes size, int cost, String colour) {
        super(size, cost, colour);
    }


    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела футболку");
    }
}
