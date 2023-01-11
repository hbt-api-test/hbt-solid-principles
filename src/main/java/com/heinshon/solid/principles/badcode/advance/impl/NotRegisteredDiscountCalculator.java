package com.heinshon.solid.principles.badcode.advance.impl;

import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculator;

public class NotRegisteredDiscountCalculator implements IAccountDiscountCalculator {
    @Override
    public double applyDicount(double price) {
        return price;
    }
}
