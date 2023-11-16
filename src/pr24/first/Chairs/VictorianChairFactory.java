package pr24.first.Chairs;

public class VictorianChairFactory implements ChairAbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
