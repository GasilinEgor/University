package pr4.second;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Sizes.L, 2100, "Blue"),
                new Pants(Sizes.M, 3500, "Black"),
                new Skirt(Sizes.S, 10000, "Red"),
                new Tie(Sizes.XS, 1700, "Green")
        };
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}
