package org.example.tax;

import org.example.item.PurchaseCartItem;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AppliedTaxPolicy implements AppliedTax {

    private Set<Tax> taxes;

    public AppliedTaxPolicy(Tax ... taxes) {
        this.taxes = new HashSet<>(Arrays.asList(taxes));
    }

    public Set<Tax> getTaxes() {
        return taxes;
    }

    @Override
    public Collection<ItemTax> apply(final PurchaseCartItem item) {
        return taxes.stream()
                .filter(tp ->tp.getExemption().checkItemForTaxExemption(item.getItem()))
                .map(x -> new ItemTax(item, calculateTax(item, x).toPlainString()))
                .collect(Collectors.toList());
    }

    @Override
    public BigDecimal calculateTax(PurchaseCartItem item, Tax tax) {
        return item.getItem().getPrice().getPrice().multiply(tax.getRate());
    }


}
