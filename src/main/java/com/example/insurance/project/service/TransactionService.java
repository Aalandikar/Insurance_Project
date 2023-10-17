package com.example.insurance.project.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.insurance.project.model.Transaction;

@RestController
public interface TransactionService {
	public List<Transaction> getAllTransactions() ;
	 public Transaction getTransactionById(Integer transactionId) ;
	 public Transaction saveTransaction(Transaction transaction);
	 public Transaction updateTransaction(Transaction transaction);
	 public String deleteTransaction(Integer transactionId);

}
