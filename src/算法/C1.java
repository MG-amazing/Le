package 算法;

import java.util.Arrays;

public class C1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        //四个元素排三轮
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
