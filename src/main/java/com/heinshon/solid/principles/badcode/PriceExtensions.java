package com.heinshon.solid.principles.badcode;

import static com.heinshon.solid.principles.badcode.Constants.*;

public abstract class PriceExtensions {

    public static double applyDiscountForAccountStatus(double price, double discountSize)
    {
        return price - (discountSize * price);
    }

    public static double applyDiscountForTimeOfHavingAccount(double price, int timeOfHavingAccountInYears)
    {
        double discountForLoyaltyInPercentage =
                (timeOfHavingAccountInYears > MAXIMUM_DISCOUNT_FOR_LOYALTY) ?
                        ((double) MAXIMUM_DISCOUNT_FOR_LOYALTY / 100) :
                        ((double) timeOfHavingAccountInYears / 100);
        return price - (discountForLoyaltyInPercentage * price);
    }

}
