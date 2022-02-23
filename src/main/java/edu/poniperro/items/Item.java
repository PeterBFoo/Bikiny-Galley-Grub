package edu.poniperro.items;

public class Item implements Product {
    String name;
    Double price;
    String extra = null;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    public String name() {
        return this.name;
    }

    public Double price() {
        return this.price;
    }

    public String extra() {
        return  this.extra;
    }

    public Boolean isRegular() {
        return extra != null;
    }

    @Override
    public String toString() {
        return name() + "...." + String.format("%.2f", price()) + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item) {
            return this.name.equals(((Item)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
