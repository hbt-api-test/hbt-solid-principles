package com.heinshon.solid.principles.badcode.advance.impl;

import com.heinshon.solid.principles.badcode.AccountStatus;
import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculator;
import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculatorFactory;

public class DefaultAccountDiscountCalculatorFactory implements IAccountDiscountCalculatorFactory {
    @Override
    public IAccountDiscountCalculator GetAccountDiscountCalculator(AccountStatus accountStatus) {

        IAccountDiscountCalculator calculator;
        switch (accountStatus){
            case NotRegistered:
                calculator = new NotRegisteredDiscountCalculator();
                break;
            case SimpleCustomer:
                calculator = new SimpleCustomerDiscountCalculator();
                break;
            case ValuableCustomer:
                calculator = new ValuableCustomerDiscountCalculator();
                break;
            case MostValuableCustomer:
                calculator = new MostValuableCustomerDiscountCalculator();
                break;
            default:
                throw new IllegalArgumentException("Implementación no valida");
        }


        return calculator;
    }
}
