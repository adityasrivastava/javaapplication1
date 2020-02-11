package org.example.item;

import java.math.BigDecimal;

public class Item {

    private String name;

    private BigDecimal price;

    private ItemType type;

    private boolean imported;

    public Item(String name, BigDecimal price, ItemType type, boolean imported){
        this.name = name;
        this.price = price;
        this.type = type;
        this.imported = imported;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
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
