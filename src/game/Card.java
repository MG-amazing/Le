package game;

public class Card {
    private String size;
    private String color;
    private int index;

    public Card(String size, String color,int index) {
        this.index=index;
        this.size = size;
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Card() {
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size+color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
