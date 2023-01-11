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

        double discountForLoyaltyInPercentage  =
                (timeOfHavingAccountInYears > MAXIMUM_DISCOUNT_FOR_LOYALTY) ?
                        (double) MAXIMUM_DISCOUNT_FOR_LOYALTY/100 :
                        (double) timeOfHavingAccountInYears/100;


        switch (accountStatus){
            case NotRegistered:
                priceAfterDiscount = price;
                break;
            case SimpleCustomer:
                priceAfterDiscount = (price - (DISCOUNT_FOR_SIMPLE_CUSTOMERS * price));
                priceAfterDiscount = priceAfterDiscount -
                        (discountForLoyaltyInPercentage * priceAfterDiscount);
                break;
            case ValuableCustomer:
                priceAfterDiscount = (DISCOUNT_FOR_VALUABLE_CUSTOMERS * price);
                priceAfterDiscount = priceAfterDiscount -
                        (discountForLoyaltyInPercentage * priceAfterDiscount);
                break;
            case MostValuableCustomer:
                priceAfterDiscount = (price - (DISCOUNT_FOR_MOST_VALUABLE_CUSTOMERS * price));
                priceAfterDiscount = priceAfterDiscount -
                        (discountForLoyaltyInPercentage * priceAfterDiscount);
                break;
            default:
                throw new NoSuchMethodException("Metodo no implementado");
        }


        return priceAfterDiscount;
    }

}
