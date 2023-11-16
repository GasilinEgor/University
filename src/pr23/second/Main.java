package pr23.second;

public class Main {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.enqueue(new ArrayQueueModule(4));
        queue.enqueue(new ArrayQueueModule(10000));
        System.out.println(queue.size());
        System.out.println(queue.element().getValue());
        System.out.println(queue.dequeue().getValue());
        System.out.println(queue.size());
    }
}
