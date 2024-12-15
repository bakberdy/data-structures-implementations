



public class Node<Type> {
    Node<Type> prev;
    Node<Type> next;
    Type value;

    public Node(Type value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
