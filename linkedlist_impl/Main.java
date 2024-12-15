
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addToBeginning(10);
        list.addToBeginning(20);
        list.addToEnd(30);
        list.addToEnd(40);

        System.out.println("After adding elements: " + list);

        System.out.println("Size of the list: " + list.size());

        try {
            list.removeFirst();
            System.out.println("After removeFirst: " + list);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        try {
            list.removeLast();
            System.out.println("After removeLast: " + list);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        try {
            list.removeAtIndex(0);
            System.out.println("After removeAtIndex(0): " + list);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }

        list.addToBeginning(20);
        list.addToEnd(10);
        System.out.println("Before remove(30): " + list);
        list.remove(30);
        System.out.println("After remove(30): " + list);

        try {
            LinkedList<Integer> emptyList = new LinkedList<>();
            emptyList.removeFirst();
        } catch (EmptyListException e) {
            System.out.println("Caught exception: " + e.message);
        }

        System.out.println("Final list: " + list);

        list.reverse();
        System.out.println("reverse list: " + list);


        list.addToBeginning(40);
        list.addToBeginning(20);
        list.addToEnd(30);
        list.addToEnd(10);
        list.addToEnd(50);

        System.out.println("Before sorting: " + list);

        list.bubbleSort();

        System.out.println("After sorting: " + list);
    }
}
