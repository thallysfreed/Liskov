package com.silth;

public class SuggarCredit extends SuggarCard{
    @Override
    public void validade() throws Exception {
        System.out.println("Checking limit!");
        System.out.println("Has limit!");
    }
}
