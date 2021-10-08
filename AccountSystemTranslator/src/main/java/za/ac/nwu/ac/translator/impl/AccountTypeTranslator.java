package za.ac.nwu.ac.translator.impl;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.time.LocalDate;
import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDto> getAllAccountTypes();
    
    AccountTypeDto create(AccountTypeDto accountType);
    
    AccountTypeDto save(AccountType accountType);
    
    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
    
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);
    
    AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate);
    
    AccountTypeDto deleteAccountType(String mnemonic);
    
    void someMethod();

    AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic);

//AccountType getAccountTypeDbEntityByMnemonic(String mnemonic);
    
    /*  AccountType getAccountTypeDbEntityByMnemonic(String mnemonic);
   
   void delete(AccountType accountType); */
    
}