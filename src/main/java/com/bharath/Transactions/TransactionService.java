package com.bharath.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> allTransactions()
    {
        return transactionRepository.findAll();

    }

    // You might consider adding methods for inserting/updating transactions
}