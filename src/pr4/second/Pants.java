package pr4.second;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    Pants(Sizes size, int cost, String colour) {
        super(size, cost, colour);
    }


    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела штаны");
    }
}
