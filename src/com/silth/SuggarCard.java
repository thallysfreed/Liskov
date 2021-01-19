package com.silth;

abstract public class SuggarCard implements IPayment{
    @Override
    public void validade() throws Exception {
        //Validation
    }

    @Override
    public void collectPayment() {
        System.out.println("Payment ok");
    }
}
