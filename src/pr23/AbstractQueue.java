package pr23;

import pr23.second.ArrayQueueModule;

public abstract class AbstractQueue {
    abstract void enqueue(ArrayQueueModule newModule);
    abstract ArrayQueueModule element();
    abstract ArrayQueueModule dequeue();
    abstract int size();
    abstract boolean isEmpty();
    abstract void clear();
}
