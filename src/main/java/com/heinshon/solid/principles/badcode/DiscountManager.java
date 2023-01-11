package com.heinshon.solid.principles.badcode;

public class DiscountManager {

    public double ApplyDiscount(double price, AccountStatus accountStatus, int timeOfHavingAccountInYears){
        double priceAfterDiscount = 0;

        double discountForLoyaltyInPercentage  = (timeOfHavingAccountInYears > 5) ? (double) 5/100 : (double) timeOfHavingAccountInYears/100;

        if(accountStatus == AccountStatus.NotRegistered){
            priceAfterDiscount = price;
        }
        else if(accountStatus == AccountStatus.SimpleCustomer){
            priceAfterDiscount = ((price - (0.1 * price)) - discountForLoyaltyInPercentage  * (price - (0.1 * price)));
        }
        else if (accountStatus == AccountStatus.ValuableCustomer)
        {
            priceAfterDiscount = (0.7 * price) - discountForLoyaltyInPercentage  * (0.7 * price);
        }
        else if (accountStatus == AccountStatus.MostValuableCustomer)
        {
            priceAfterDiscount = (price - (0.5 * price)) - discountForLoyaltyInPercentage  * (price - (0.5 * price));
        }

        return priceAfterDiscount;
    }

}
