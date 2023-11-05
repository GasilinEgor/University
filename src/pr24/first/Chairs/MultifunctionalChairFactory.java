package pr24.first.Chairs;

public class MultifunctionalChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
