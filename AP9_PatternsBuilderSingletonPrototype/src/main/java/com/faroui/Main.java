package com.faroui;


import com.faroui.model.AccountType;
import com.faroui.model.BankAccount;
import com.faroui.repository.AccountRepositoryImpl;
import com.faroui.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer <BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        for(int i=0;i<10;i++){
            new Thread(() -> {
                accountRepository.populateData();
            }).start();
        }
        System.out.println("Tape a character" +
                "");
        System.in.read();
        List<BankAccount> bankAccounts = accountRepository.findAll();
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);
    }

}