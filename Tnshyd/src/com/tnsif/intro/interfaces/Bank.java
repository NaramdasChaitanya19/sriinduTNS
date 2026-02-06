package com.tnsif.intro.interfaces;

public interface Bank {
	int MIN_BALANCE=1000;
	int DEPOSITE_LIMIT=25000;
	void deposite(Account account,double amount);
	void withdraw(Account account,double amount);


}
