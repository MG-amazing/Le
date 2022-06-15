package File_dome;

import java.io.File;
import java.util.Scanner;

public class File_dome1 {
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        String n1 = SC.nextLine();
        String n2=SC.nextLine();


        searchFile(new File(n2), n1);

    }

    /**
     * @param dir      当前文件路径
     * @param filename 当前文件名
     */
    private static void searchFile(File dir, String filename) {
        if (dir != null && dir.isDirectory()) {
            //可以找
            //得到一级文件对象
            File[] files = dir.listFiles();//null
            //判断是否存在文件对象，才可以遍历
            if (files != null && files.length > 0) {
                for (File file : files) {
                    //判断当前遍历的一级文件是对象还是目录
                    if (file.getName().contains(filename)) {
                        System.out.println("找到了" + file.getAbsolutePath());
                    } else {
                        //是文件夹，继续调用此方法递归寻找
                        searchFile(file, filename);
                    }
                }
            }

        } else {
            System.out.println("当前找的地址不是一个目录");
        }


    }
}
