package org.example.item;

public class Item {

    private String name;

    private Price price;

    private ItemType type;

    private boolean imported;

    public Item(String name, Price price, ItemType type, boolean imported){
        this.name = name;
        this.price = price;
        this.type = type;
        this.imported = imported;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }

    public boolean isImported() {
        return imported;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", imported=" + imported +
                '}';
    }
}
