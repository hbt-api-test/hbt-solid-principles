package com.heinshon.solid.principles.badcode.advance.discount;

import com.heinshon.solid.principles.badcode.AccountStatus;
import com.heinshon.solid.principles.badcode.PriceExtensions;
import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculatorFactory;
import com.heinshon.solid.principles.badcode.advance.ILoyaltyDicountCalculator;

import static com.heinshon.solid.principles.badcode.Constants.*;

public class DiscountManager {

    private final IAccountDiscountCalculatorFactory discountCalculatorFactory;
    private final ILoyaltyDicountCalculator loyaltyDicountCalculator;

    public DiscountManager(IAccountDiscountCalculatorFactory discountCalculatorFactory,
                           ILoyaltyDicountCalculator loyaltyDicountCalculator) {
        this.discountCalculatorFactory = discountCalculatorFactory;
        this.loyaltyDicountCalculator = loyaltyDicountCalculator;
    }


    public double applyDiscount(double price, AccountStatus accountStatus, int timeOfHavingAccountInYears){
        double priceAfterDiscount = 0;

        priceAfterDiscount = discountCalculatorFactory.GetAccountDiscountCalculator(accountStatus)
                .applyDicount(price);

        priceAfterDiscount = loyaltyDicountCalculator.applyDiscount(priceAfterDiscount,
                timeOfHavingAccountInYears);

        return priceAfterDiscount;
    }

}
