package com.heinshon.solid.principles.badcode;

public class DiscountManager {

    public double ApplyDiscount(double price, int accountStatus, int timeOfHavingAccountInYears){
        double priceAfterDiscount = 0;

        double discountForLoyaltyInPercentage  = (timeOfHavingAccountInYears > 5) ? (double) 5/100 : (double) timeOfHavingAccountInYears/100;

        if(accountStatus == 1){
            priceAfterDiscount = price;
        }
        else if(accountStatus == 2){
            priceAfterDiscount = ((price - (0.1 * price)) - discountForLoyaltyInPercentage  * (price - (0.1 * price)));
        }
        else if (accountStatus == 3)
        {
            priceAfterDiscount = (0.7 * price) - discountForLoyaltyInPercentage  * (0.7 * price);
        }
        else if (accountStatus == 4)
        {
            priceAfterDiscount = (price - (0.5 * price)) - discountForLoyaltyInPercentage  * (price - (0.5 * price));
        }

        return priceAfterDiscount;
    }

}
