package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiOrderNetworkDecorator extends AbstractTaxiOrderDecorator {
    public TaxiOrderNetworkDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        //hardcoded stub cost = 35
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Taxi Network";
    }
}
