package pr4.second;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женщина:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing)item).dressWoman();
                System.out.println("Размер: " + item.getSize() + "(" + item.getSize().getEuroSize() + ")");
                System.out.println("Стоимость: " + item.getCost());
                System.out.println("Цвет: " + item.getColour());
                System.out.println();
            }
        }
    }


    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужчина:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing)item).dressMan();
                System.out.println("Размер: " + item.getSize() + "(" + item.getSize().getEuroSize() + ")");
                System.out.println("Стоимость: " + item.getCost());
                System.out.println("Цвет: " + item.getColour());
                System.out.println();
            }
        }
    }
}
