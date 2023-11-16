package pr23.second;

import java.util.LinkedList;

public class LinkedQueue implements Queue {
    private LinkedList<ArrayQueueModule> list = new LinkedList<>();
    @Override
    public void enqueue(ArrayQueueModule newModule) {
        list.add(newModule);
    }

    @Override
    public ArrayQueueModule element() {
        return list.getFirst();
    }

    @Override
    public ArrayQueueModule dequeue() {
        return list.remove(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public void clear() {
        list = new LinkedList<ArrayQueueModule>();
    }
}
