package pr23.first;

public class ArrayQueue extends ArrayQueueADT {
    public ArrayQueue(int capacity) {
        super(capacity);
    }

    @Override
    public void enqueue(ArrayQueueModule newModule) {
        if (size == capacity) {
            System.out.println("Очередь максимальна!");
        }
        else if (size == 0) {
            size++;
            newModule.setNextModule(newModule);
            this.Modules[size - 1] = newModule;
            this.head = newModule;
            this.tail = newModule;
        }
        else {
            size++;
            newModule.setNextModule(this.head);
            this.Modules[size - 1] = newModule;
            this.Modules[size - 2].setNextModule(newModule);
            this.tail = newModule;
        }
    }

    @Override
    public ArrayQueueModule element() {
        return this.head;
    }

    @Override
    public ArrayQueueModule dequeue() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            ArrayQueueModule obj = this.head;
            size--;
            this.Modules[0] = null;
            this.head = null;
            this.tail = null;
            return obj;
        }
        else {
            ArrayQueueModule obj = this.head;
            size--;
            for (int i = 0; i < size; i++) {
                this.Modules[i] = this.Modules[i + 1];
            }
            this.Modules[size - 1].setNextModule(this.Modules[0]);
            this.head = this.Modules[0];
            return obj;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.Modules = new ArrayQueueModule[capacity];
    }
}
