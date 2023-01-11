package com.heinshon.solid.principles.service.dip.solution;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard1= new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.doPurchaseSomething(500);
    }
}
