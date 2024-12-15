
public class LinkedList<Type extends  Comparable<Type>> {
    Node<Type> head;
    Node<Type> tail;

    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    void addToBeginning(Type item) {
        Node<Type> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addToEnd(Type item) {
        Node<Type> newNode = new Node<>(item);
        if (tail == null) {
            tail = newNode;
            head = newNode;

        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<Type> current = head;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" <-> ");
            }
            current = current.next;
        }

        return sb.toString();
    }

    int size() {
        return size;
    }

    void removeFirst() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException("Empty List");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void removeLast() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException("Empty List");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void removeAtIndex(int index) throws EmptyListException {
        if (index >= size) {
            throw new EmptyListException("Empty List");
        }

        Node<Type> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        try {
            if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                size--;
            }
        } catch (EmptyListException e) {
            throw e;
        }

    }

    void remove(Type value) {

        Node<Type> temp = head;
        while (temp != null) {
            if (temp.value.equals(value)) {
                if (temp == head) {
                    head = temp.next;
                    head.prev = null;
                } else if (temp == tail) {
                    temp = temp.prev;
                    temp.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    void reverse() {
        Node<Type> current = head;
        Node<Type> temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;

        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void bubbleSort() {
        if (head == null || head.next == null) {
            return;
        }
    
        boolean swapped = true;
    
        while (swapped) {
            swapped = false;
            Node<Type> current = head;
    
            while (current != null && current.next != null) {
                if (current.value.compareTo(current.next.value) > 0) {
                    Type temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;
    
                    swapped = true;
                }
                current = current.next;
            }
        }
    }
    

}

class EmptyListException extends Exception {
    String message;

    public EmptyListException(String message) {
        this.message = message;
    }
}
