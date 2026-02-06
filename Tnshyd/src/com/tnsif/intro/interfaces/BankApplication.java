package com.tnsif.intro.interfaces;

public class BankApplication {
	public static void main(String[] args) {
		
		Bank bank=new BankImplement();
		Account account=new Account(1234,"Chaitanya",5000,bank);
		bank.deposite(account,5000);
		bank.withdraw(account, 3000);
		System.out.println(account);
}

}

