package com.example.insurance.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.insurance.project.model.Transaction;
import com.example.insurance.project.repository.TransactionRepository;
import com.example.insurance.project.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction getTransactionById(Integer transactionId) {
        return transactionRepository.getById(transactionId);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public String deleteTransaction(Integer transactionId) {
        transactionRepository.deleteById(transactionId);
        return "Record Deleted Successfully!!";
    }

	@Override
	public Transaction updateTransaction(Transaction transaction) {
		 return transactionRepository.save(transaction);
	}
}
