package com.faroui;

import com.faroui.model.AccountStatus;
import com.faroui.model.AccountType;
import com.faroui.model.BankAccount;
import com.faroui.model.BankDirector;

public class Main {
    public static void main(String[] args) {
        //trois facon pour creer un objet
        BankAccount account2=new BankAccount(3L,6500,"MAD",AccountType.SAVING_ACCOUNT,AccountStatus.CREATED);
        System.out.println(account2.toString());
        BankAccount account=new BankAccount();
        account.setAccountId(2L);
        account.setType(AccountType.SAVING_ACCOUNT);
        account.setStatus(AccountStatus.CREATED);
        account.setCurrency("MAD");
        account.setBalance(9000);

        BankAccount account1 = BankDirector.accountBuilder()
                .accountId(1L)
                .currency("MAD")
                .status(AccountStatus.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(7000)
                .build();

        BankAccount bankAccount=BankAccount.builder()
                .accountId(1L)
                .currency("MAD")
                .status(AccountStatus.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(7000)
                .build();
        System.out.println(bankAccount.toString());
    }

}