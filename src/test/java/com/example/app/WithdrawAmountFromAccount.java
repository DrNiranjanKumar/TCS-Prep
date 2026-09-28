package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithdrawAmountFromAccount {
    @Test
    void checkWithdrawPossibleorNot(){
        Account account = new Account(100);
        InsufficientFundsException test = assertThrows(InsufficientFundsException.class,()->account.withDrawAmount(5));
        System.out.println(test.getMessage());
        //assertTrue(test.getMessage().contains("Tried"));
    }
}
