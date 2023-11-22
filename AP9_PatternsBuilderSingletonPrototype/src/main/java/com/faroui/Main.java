package com.faroui;


import com.faroui.model.AccountType;
import com.faroui.model.BankAccount;
import com.faroui.repository.AccountRepositoryImpl;
import com.faroui.util.JsonSerializer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JsonSerializer <BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        //accountRepository.populateData();
        List<BankAccount> bankAccounts = accountRepository.searchAccounts(bankAccount -> bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT));
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);
//        System.out.println("======================");
//        BankAccount account=accountRepository.findById(1L).orElse(null);
//        if(account!=null){
//            System.out.println(bankAccountJsonSerializer.toJson(account));
//        }
    }

}