package com.imooc.threed1;

import java.sql.Blob;

public class Bank {

	private String account;
	private int balance; 
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Bank(String account, int balance) {
		super();
		this.account = account;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [账号=" + account + ", 余额=" + balance + "]";
	}
	
	//存款
	public synchronized void saveAccount() {
		int balance = getBalance();
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		balance+=100;
		setBalance(balance);
		System.out.println("存款后的余额"+balance);
	}
	
	
	public  void drawAccount() { // synchronized 线程保护
		synchronized (this) {
			int balance =getBalance();
			balance=balance-200;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setBalance(balance);
			System.out.println("取款后的余额"+balance);
		}

	} 

}
