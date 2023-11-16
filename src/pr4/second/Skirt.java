package pr4.second;

public class Skirt extends Clothes implements WomenClothing {
    Skirt(Sizes size, int cost, String colour) {
        super(size, cost, colour);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку");
    }
}
