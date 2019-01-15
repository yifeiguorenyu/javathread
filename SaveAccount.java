package com.imooc.threed1;
//存款
public class SaveAccount implements Runnable{
	Bank bank;

	public  SaveAccount(Bank bank) {
		this.bank= bank;
	}
	@Override
	public void run() {
		bank.saveAccount();
		
	}
	
}
