package com.heinshon.solid.principles.badcode.advance;

public interface ILoyaltyDicountCalculator {
    double applyDiscount(double price, int timeOfHavingAccountInYears);
}
