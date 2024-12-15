public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.enqueue("Low priority", 5);
        queue.enqueue("Medium priority", 3);
        queue.enqueue("High priority", 1);
        queue.enqueue("Highest priority", 0);
        queue.enqueue("Second highest priority", 2);
        queue.enqueue("Third highest priority", 4);
        queue.enqueue("Another low priority", 6);

        System.out.println("First element (highest priority): " + queue.peek());
        System.out.println("Queue size: " + queue.size());  
        System.out.println("Queue after enqueueing elements:");
        System.out.println(queue);

        System.out.println("\nPerforming dequeue operations:");

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue after dequeue:");
        System.out.println(queue);

        System.out.println("\nQueue size after all dequeues: " + queue.size()); 

        try {
            System.out.println("First element in empty queue: " + queue.peek());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage()); 
        }

        System.out.println("\nAdding elements again after clearing:");

        queue.enqueue("New High priority", 0);
        queue.enqueue("New Medium priority", 3);
        queue.enqueue("New Low priority", 5);

        System.out.println("Queue after adding new elements:");
        System.out.println(queue);

        queue.clear();
        System.out.println("\nQueue after clear:");
        System.out.println("Queue size: " + queue.size());  
    }
}
