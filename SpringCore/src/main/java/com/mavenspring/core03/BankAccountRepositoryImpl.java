package com.mavenspring.core03;

public abstract class BankAccountRepositoryImpl implements BankAccountRepository {

	private void bankAccRepoImpl(){
		  BankAccount bankAcc = new BankAccount();
		  bankAcc.setAccountHolderName("Mounika");
		  bankAcc.setAccountId(65);
		  bankAcc.setAccountType("Savings");
		  bankAcc.setAccountBalance((long) 20345.5);


		}

}
