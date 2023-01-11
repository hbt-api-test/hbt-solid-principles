package com.heinshon.solid.principles.badcode;

import lombok.SneakyThrows;


import static com.heinshon.solid.principles.badcode.Constants.DISCOUNT_FOR_MOST_VALUABLE_CUSTOMERS;
import static com.heinshon.solid.principles.badcode.Constants.DISCOUNT_FOR_SIMPLE_CUSTOMERS;
import static com.heinshon.solid.principles.badcode.Constants.DISCOUNT_FOR_VALUABLE_CUSTOMERS;
import static com.heinshon.solid.principles.badcode.Constants.MAXIMUM_DISCOUNT_FOR_LOYALTY;

public class DiscountManager {

    @SneakyThrows
    public double applyDiscount(double price, AccountStatus accountStatus, int timeOfHavingAccountInYears){
        double priceAfterDiscount = 0;

        switch (accountStatus){
            case NotRegistered:
                priceAfterDiscount = price;
                break;
            case SimpleCustomer:
                priceAfterDiscount = PriceExtensions.applyDiscountForAccountStatus(price, DISCOUNT_FOR_SIMPLE_CUSTOMERS);
                priceAfterDiscount = PriceExtensions.applyDiscountForTimeOfHavingAccount(priceAfterDiscount, timeOfHavingAccountInYears);
                break;
            case ValuableCustomer:
                priceAfterDiscount = PriceExtensions.applyDiscountForAccountStatus(price, DISCOUNT_FOR_VALUABLE_CUSTOMERS);
                priceAfterDiscount = PriceExtensions.applyDiscountForTimeOfHavingAccount(priceAfterDiscount, timeOfHavingAccountInYears);
                break;
            case MostValuableCustomer:
                priceAfterDiscount = PriceExtensions.applyDiscountForAccountStatus(price, DISCOUNT_FOR_MOST_VALUABLE_CUSTOMERS);
                priceAfterDiscount = PriceExtensions.applyDiscountForTimeOfHavingAccount(priceAfterDiscount, timeOfHavingAccountInYears);
                break;
            default:
                throw new NoSuchMethodException("Metodo no implementado");
        }


        return priceAfterDiscount;
    }

}
