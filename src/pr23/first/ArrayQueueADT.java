package pr23.first;

public abstract class ArrayQueueADT {
    protected int capacity;
    protected int size;
    protected ArrayQueueModule head;
    protected ArrayQueueModule tail;
    protected ArrayQueueModule[] Modules;


    public ArrayQueueADT(int capacity) {
        if (capacity <= 0) {
            System.out.println("Нужно положительное число, установленный размер - 0");
            this.capacity = 0;
        }
        else {
            this.capacity = capacity;
        }
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.Modules = new ArrayQueueModule[this.capacity];
    }


    public abstract void enqueue(ArrayQueueModule newModule);
    public abstract ArrayQueueModule element();
    public abstract ArrayQueueModule dequeue();
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract void clear();
}
