package org.example.item;

import java.math.BigDecimal;

public class Price {

    private BigDecimal price;

    public Price(String price) {
        this.price = new BigDecimal(price);
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                '}';
    }
}
