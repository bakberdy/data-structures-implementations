

public class PriorityQueue<Type> {
    Node<Type> head;
    Node<Type> tail;
    int size;

    public PriorityQueue() {
        this.size = 0;
    }

    private static class Node<Type> {
        int priority;
        Type value;
        Node<Type> next;

        public Node(Type value, int priority) {
            this.next = null;
            this.priority = priority;
            this.value = value;
        }
    }

    public void enqueue(Type item, int priority) {
        Node<Type> newNode = new Node<>(item, priority);

        if (head == null || head.priority > priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<Type> current = head;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public Type dequeue() {
        Type value = head.value;
        head = head.next;
        size--;
        return value;
    }

    public Type peek() {
        if(head==null) throw new IllegalArgumentException("Empty Queue");
        Type value = head.value;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    Node<Type> current = head; 

    while (current != null) {
        sb.append(current.value).append(" (Priority: ").append(current.priority).append(") <---->");
        current = current.next;
    }
    
    return sb.toString();
}

}