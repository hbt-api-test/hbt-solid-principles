package com.heinshon.solid.principles.badcode;

public class DiscountManager {

    public double applyDiscount(double price, AccountStatus accountStatus, int timeOfHavingAccountInYears){
        double priceAfterDiscount = 0;

        double discountForLoyaltyInPercentage  = (timeOfHavingAccountInYears > 5) ? (double) 5/100 : (double) timeOfHavingAccountInYears/100;


        switch (accountStatus){
            case NotRegistered:
                priceAfterDiscount = price;
                break;
            case SimpleCustomer:
                priceAfterDiscount = (price - (0.1 * price));
                priceAfterDiscount = priceAfterDiscount -
                        (discountForLoyaltyInPercentage * priceAfterDiscount);
                break;
            case ValuableCustomer:
                priceAfterDiscount = (0.7 * price);
                priceAfterDiscount = priceAfterDiscount -
                        (discountForLoyaltyInPercentage * priceAfterDiscount);
                break;
            case MostValuableCustomer:
                priceAfterDiscount = (price - (0.5 * price));
                priceAfterDiscount = priceAfterDiscount -
                        (discountForLoyaltyInPercentage * priceAfterDiscount);
                break;
            default:
                break;
        }


        return priceAfterDiscount;
    }

}
