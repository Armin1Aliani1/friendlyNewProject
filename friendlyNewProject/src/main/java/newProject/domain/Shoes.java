package newProject.domain;

import javax.persistence.Entity;

@Entity
public class Shoes extends Product {
    private int size;
    private String color;
    private Type type;

    public Shoes() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    enum Type {SPORT, MEN, WOMEN, CHILDES}
}
