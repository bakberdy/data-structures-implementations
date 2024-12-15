import java.util.Arrays;

class MyArrayList<Type>{
    private Type[] array;
    private int size;

    public MyArrayList(){
        array = (Type[]) new Object[4];
        size = 0;
    }


    Type deleteItemByIndex(int index){
        return null;
    }

    int searchItem(Type item){
        for(int i = 0; i < size; i++){
            if(array[i]==item){
                return i;
            }
        }
        return -1;
    }

    Type getItemByIndex(int index){
        if(index<size){
            return array[index];
        }else{
            return  null;
        }
    }
    void deleteLast(){
        array[size--]= null;
    }

    void addItem(Type item){
        if(size==array.length){
            array = Arrays.copyOf(array, size*2);
        }
        array[size++]=item;
    }

    @Override
    public String toString(){
            String str = "";
            for(int i = 0 ; i< size;i++){
                str+=array[i]+", ";
            }
            return str;
        }

}