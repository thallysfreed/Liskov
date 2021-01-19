package com.silth;

public class SuggarDebit extends SuggarCard{
    @Override
    public void validade() throws Exception {
        System.out.println("Checking balance!");
        System.out.println("Balance ok!");
    }
}
