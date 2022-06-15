package Stream流;

public class Top_performer {
    private String name;
    private double money;

    public Top_performer() {
    }

    public Top_performer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Top_performer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
