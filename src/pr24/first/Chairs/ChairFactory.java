package pr24.first.Chairs;

public class ChairFactory {
    public static Chair getChair(ChairAbstractFactory chairAbstractFactory) {
        return chairAbstractFactory.createChair();
    }
}
