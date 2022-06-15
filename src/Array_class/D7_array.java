package Array_class;


import java.util.Arrays;
import java.util.Comparator;

public class D7_array {
    public static void main(String[] args) {
        int a1[] = {10, 20, 30, 24, 100};
        System.out.println(a1);
        System.out.println(Arrays.toString(a1));

        //自动排序的API
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        //二分搜索查找(必须是支持的否则出bug)
        int index = Arrays.binarySearch(a1, 20);
        System.out.println(index);
        //有则返回<0则证明不存在，返回应该插入位置索引的负值加1
        int[] arr2 = {12, 24, 34, 25, 234, 356, 100};
        System.out.println(Arrays.binarySearch(arr2, 310));
        //Arrays的sort方法默认是升序排序
        Integer[] arr3 = {34, 12, 42, 23};
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //左边大于右边的返回正数
                //右边大于左边返回负数

                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr3));
    }
}
