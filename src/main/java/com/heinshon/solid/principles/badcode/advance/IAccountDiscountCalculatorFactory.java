package com.heinshon.solid.principles.badcode.advance;

import com.heinshon.solid.principles.badcode.AccountStatus;

public interface IAccountDiscountCalculatorFactory {
    IAccountDiscountCalculator GetAccountDiscountCalculator(AccountStatus accountStatus);
}
