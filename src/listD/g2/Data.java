package listD.g2;

public interface Data <E>{
    void add(E a);
    void delete(int id);
    void update(E e);
    void queryById(int id);
}
