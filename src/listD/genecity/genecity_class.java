package listD.genecity;

public class genecity_class {
    public static void main(String[] args) {
        //需求，根据ArrayList
        MyArrayList<String>list=new MyArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MYSQL");
        list.remove("MYSQL");
        System.out.println(list);
        MyArrayList<Integer>list1=new MyArrayList<>();
        list1.add(32);
        list1.add(28);
        list1.add(25);
        list1.remove(25);
        System.out.println(list1);
    }
}
