package listD.genecity;

import java.util.ArrayList;

public class MyArrayList<E> {
    private ArrayList lists=new ArrayList<>();
    public void remove(E e){
        lists.remove(e);
    }
    public void add(E e){
        lists.add(e);
    }
    public String toString(){
        return lists.toString();
    }
}
