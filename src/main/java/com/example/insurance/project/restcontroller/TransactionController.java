package com.example.insurance.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.insurance.project.model.Transaction;
import com.example.insurance.project.service.TransactionService;


@RestController
public class TransactionController {
	
	@Autowired
 private TransactionService transactionService;
	
	@PostMapping("insurance/saveTransaction")
	public Transaction saveTransaction(@RequestBody Transaction transaction) {
		Transaction transaction1=transactionService.saveTransaction(transaction);
		return transaction1;
	}
	
	@PutMapping("insurance/updateTransaction")
	public Transaction updateTransaction(@RequestBody Transaction transaction) {
		Transaction transaction1 = transactionService.updateTransaction(transaction);
		return transaction1;
	}

	@GetMapping("insurance/getTransactionsList")
	public List<Transaction> getTransactionList() {
		List<Transaction> transactions = transactionService.getAllTransactions();
		return transactions;

	}

	@GetMapping("insurance/getTransactionById/{transactionId}")
	public Transaction getTransactionById(@PathVariable("transactionId") Integer transactionId) throws Exception {
		Transaction transaction = transactionService.getTransactionById(transactionId);
			return transaction;

	}

	@DeleteMapping("insurance/DeleteTransactionById{transactionId}")
	public String DeleteTransactionById(@PathVariable("transactionId") Integer transactionId) {
		transactionService.deleteTransaction(transactionId);
		return "Deleted successfully!!";

	}

}
