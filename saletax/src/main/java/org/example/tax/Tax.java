package org.example.tax;

import java.math.BigDecimal;

public class Tax {
    private TaxType type;
    private BigDecimal rate;
    private TaxExemptionPolicy exemption;

    public Tax(TaxType type, String rate, TaxExemptionPolicy exemption) {
        this.type = type;
        this.rate = new BigDecimal(rate);
        this.exemption = exemption;
    }

    public TaxType getType() {
        return type;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public TaxExemptionPolicy getExemption() {
        return exemption;
    }
}
