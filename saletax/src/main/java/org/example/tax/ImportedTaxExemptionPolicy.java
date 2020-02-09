package org.example.tax;

import org.example.item.Item;

public class ImportedTaxExemptionPolicy implements TaxExemptionPolicy {

    public ImportedTaxExemptionPolicy() {
    }

    @Override
    public boolean checkItemForTaxExemption(Item item) {
        if(item.isImported())
            return true;
        return false;
    }
}
