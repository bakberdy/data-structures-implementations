public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new  MyArrayList<>();

        System.out.println("my list initial: "+myList.toString());

        myList.addItem(2);
        myList.addItem(5);
        myList.addItem(6);
        myList.addItem(7);
        myList.addItem(9);
        myList.addItem(9);
        myList.addItem(2);

        System.out.println("my list after: "+ myList.toString());

        myList.deleteLast();

        System.out.println("my list after: "+ myList.toString());

        System.out.println(myList.searchItem(7));

    

    }
}
