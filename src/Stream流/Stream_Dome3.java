package Stream流;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求分析
 * 需求: 某个公司开发的部门，分为开发一部和开发二部，宣布再需要对年终的数据进行结算.
 * 分析
 * 员工信息至少包含了(名称、性别、工资、奖金、处罚记录)
 * 开发一部有4个员工 、开发二部有5名员工
 * 分别筛选出2个 部门 员工的最高工资的员工信息，封装成优秀的员工对象 Topper_former
 * 分别统计出2个部门的平均收入，去掉最高工资和最低工资。
 * 统计2个开发 部门 整体的平均工资，去掉最高工资和最低工资并求取平均值。
 **/


public class Stream_Dome3 {
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));


        List<Employee>two = new ArrayList<>();
        two.add(new Employee("武松",'男',25000,25000,null));
        two.add(new Employee("李逵",'男',20000,10000,null));
        two.add(new Employee("西门庆",'男',50000,10000,"被打"));
        two.add(new Employee("潘金莲",'女',3500,1000,"被打"));
        two.add(new Employee("武大郎",'女',20000,0,"下毒"));
        //开发一部的最高员工的工资
        //指定比较规则
//        Employee e=one.stream().max((e1,e2)->Double.compare(e1.getSalary()+ e1.getBonus(), e2.getSalary()+ e2.getBonus() ))
//                .get();
//        System.out.println(e);
        Top_performer t=one.stream().max((e1,e2)->Double.compare(e1.getSalary()+ e1.getBonus(), e2.getSalary()+ e2.getBonus() ))
                .map(e -> new Top_performer(e.getName(),(e.getSalary())+e.getBonus())).get();
        System.out.println(t);
        //统计出两个部门的平均工资并去掉最高工资和最低工资
        //sorted()可以排序的方法
        one.stream().sorted();
    }
}
