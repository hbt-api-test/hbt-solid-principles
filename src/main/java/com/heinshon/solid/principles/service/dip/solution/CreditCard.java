package com.heinshon.solid.principles.service.dip.solution;

public class CreditCard implements BankCard{

    public void doTransaction(long amont){
        System.out.println("pago con tarjeta credito");
    }

}
