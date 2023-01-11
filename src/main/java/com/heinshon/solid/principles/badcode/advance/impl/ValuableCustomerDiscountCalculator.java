package com.heinshon.solid.principles.badcode.advance.impl;

import com.heinshon.solid.principles.badcode.Constants;
import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculator;

public class ValuableCustomerDiscountCalculator implements IAccountDiscountCalculator {
    @Override
    public double applyDicount(double price) {
        return price - (Constants.DISCOUNT_FOR_VALUABLE_CUSTOMERS * price);
    }
}
