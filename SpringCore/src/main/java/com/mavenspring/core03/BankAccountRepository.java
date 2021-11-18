package com.mavenspring.core03;

public interface BankAccountRepository {
	
	double getBalance(long accountId);
	double updateBalance(long accountId,double newBalance);
	
}
