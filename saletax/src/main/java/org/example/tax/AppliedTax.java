package org.example.tax;

import org.example.item.PurchaseCartItem;

import java.math.BigDecimal;
import java.util.Collection;

public interface AppliedTax {
    public Collection<ItemTax> apply(PurchaseCartItem item);
    public BigDecimal calculateTax(PurchaseCartItem item, Tax tax);
}
