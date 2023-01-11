package com.heinshon.solid.principles.badcode.advance.impl;

import com.heinshon.solid.principles.badcode.AccountStatus;
import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculator;
import com.heinshon.solid.principles.badcode.advance.IAccountDiscountCalculatorFactory;

import java.util.HashMap;
import java.util.Map;

public class DefaultAccountDiscountCalculatorFactory implements IAccountDiscountCalculatorFactory {

    //Esto debera estar en una base de datos almacenada
    private Map<AccountStatus, IAccountDiscountCalculator> getDiscuntCalculator = new HashMap<>();

    public DefaultAccountDiscountCalculatorFactory() {

        Map<AccountStatus, IAccountDiscountCalculator> calculatorMap = new HashMap<>();
        calculatorMap.put(AccountStatus.NotRegistered, new NotRegisteredDiscountCalculator());
        calculatorMap.put(AccountStatus.SimpleCustomer, new SimpleCustomerDiscountCalculator());
        calculatorMap.put(AccountStatus.ValuableCustomer, new ValuableCustomerDiscountCalculator());
        calculatorMap.put(AccountStatus.MostValuableCustomer, new MostValuableCustomerDiscountCalculator());

        this.getDiscuntCalculator = calculatorMap;
    }


    @Override
    public IAccountDiscountCalculator GetAccountDiscountCalculator(AccountStatus accountStatus) {

        IAccountDiscountCalculator calculator = getAccountDiscountCalculator(accountStatus);

        if(calculator == null){
            throw new IllegalArgumentException("Implementacion no definida");
        }

        return calculator;
    }

    private IAccountDiscountCalculator getAccountDiscountCalculator(AccountStatus accountStatus){

        return this.getDiscuntCalculator.get(accountStatus);

    }

}
