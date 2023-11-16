package pr23.first;

public class ArrayQueueModule {
    int value;
    ArrayQueueModule nextModule;


    public ArrayQueueModule(int value) {
        this.value = value;
        this.nextModule = null;
    }


    public int getValue() {
        return value;
    }


    public ArrayQueueModule getNextModule() {
        return nextModule;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void setNextModule(ArrayQueueModule nextModule) {
        this.nextModule = nextModule;
    }
}
