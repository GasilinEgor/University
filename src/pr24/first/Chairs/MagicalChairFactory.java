package pr24.first.Chairs;

public class MagicalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
