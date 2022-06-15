package IO流.字符流.序列化;

import java.io.Serializable;
//必须实现Serializable接口才能完成序列化
//transient可以让对象不参与序列化
//声明序列化的版本号
//序列化的版本号,与反序列化的版本号必须一致才不会出BUG
public class Student implements Serializable {
    private final long Ser =2;
    private String name;
    private String loginName;
    private transient String password;
    private int age;

    public Student() {

    }

    public Student(String name, String loginName, String password, int age) {
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
