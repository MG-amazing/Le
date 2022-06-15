package regex;

public class regexDome2 {
    public static void main(String[] args) {
        //判断是否与正则表达式匹配匹配则返回ture
        //只能是abc
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        //不能出现abc
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));

        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("333".matches("\\d"));
        System.out.println("z".matches("\\w"));
        System.out.println("2".matches("\\w"));
        System.out.println("21".matches("\\w"));
        System.out.println("你".matches("\\w"));
        //以上是只能校验半个字符

        //校验密码
        //必须是数字 字母 下划线 至少6位
        System.out.println("adadzczcz".matches("\\w{6,}"));
        System.out.println("233f".matches("\\w{6,}"));
        //验证码必须是数字和字母，必须是4位
        System.out.println("2df3".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));
    }
}
