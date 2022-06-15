package colliection;

import java.util.ArrayList;
import java.util.Collection;

public class D3 {
    public static void main(String[] args) {
        Collection<D3_movie>movies=new ArrayList<>();
        movies.add(new D3_movie("你好李焕英",9.5,"陈赫"));
        movies.add(new D3_movie("刺杀小说家",9.3,"王宝强"));
        movies.add(new D3_movie("唐人街探案",8.6,"杨幂"));
        System.out.println(movies);

        for (D3_movie movie : movies) {
            System.out.println("片名:"+movie.getName());
            System.out.println("得分:"+movie.getScore());
            System.out.println("主演:"+movie.getActor());
        }
    }
}
