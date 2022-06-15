package INTEGER;

public class test {
    public static void main(String[] args) {
        Integer i3=23;
        String rs=i3.toString();
        System.out.println(rs+1);
        String rs1=Integer.toString(i3);
        System.out.println(rs1+1);
        System.out.println("------------------------");
        String rs2=i3+"";
        System.out.println(rs2+1);
        String number="23";
        int age=Integer.parseInt(number);
        System.out.println(age+1);
        String number2="99.9";
        double source=Double.parseDouble(number2);
        System.out.println(source+0.1);

    }
}
