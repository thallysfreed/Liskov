package com.silth;

public class SuggarRewards extends SuggarCard{
    @Override
    public void validade() throws Exception {
        System.out.println("Checking limit and rewards!");
        System.out.println("All ok!");
    }

    @Override
    public void collectPayment() {
        super.collectPayment();
    }
}
