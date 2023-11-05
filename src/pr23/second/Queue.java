package pr23.second;

public interface Queue {

    void enqueue(ArrayQueueModule newModule);
    ArrayQueueModule element();
    ArrayQueueModule dequeue();
    int size();
    boolean isEmpty();
    void clear();

}
