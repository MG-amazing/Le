package 算法;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 350};
        Scanner sc1=new Scanner(System.in);
        int sc=sc1.nextInt();
        System.out.println(binarySearch(arr,sc));

    }

    /**
     * @param arr  排序的数组
     * @param data 要找的数据
     * @return 返回索引
     */
    public static int binarySearch(int []arr, int data) {
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            //取中间索引
            int middleIndex= (left+right)/2;
            //判断中间位置元素与要找的数据元素的大小情况
            if (data>arr[middleIndex]){
                left=middleIndex+1;
            }else if (data<arr[middleIndex]){
                //往左边走
                right=middleIndex-1;
            }else {
                return  middleIndex;
            }
        }
        return -1;//查无此元素

    }
}
