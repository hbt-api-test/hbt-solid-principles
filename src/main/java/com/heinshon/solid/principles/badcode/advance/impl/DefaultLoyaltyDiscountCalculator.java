package com.heinshon.solid.principles.badcode.advance.impl;

import com.heinshon.solid.principles.badcode.advance.ILoyaltyDicountCalculator;

import static com.heinshon.solid.principles.badcode.Constants.MAXIMUM_DISCOUNT_FOR_LOYALTY;

public class DefaultLoyaltyDiscountCalculator implements ILoyaltyDicountCalculator {

    @Override
    public double applyDiscount(double price, int timeOfHavingAccountInYears) {
        double discountForLoyaltyInPercentage =
                (timeOfHavingAccountInYears > MAXIMUM_DISCOUNT_FOR_LOYALTY) ?
                        ((double) MAXIMUM_DISCOUNT_FOR_LOYALTY / 100) :
                        ((double) timeOfHavingAccountInYears / 100);
        return price - (discountForLoyaltyInPercentage * price);
    }
}
