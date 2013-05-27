package codes.chapter16.class6.synchronize;

public class DepositThread extends Thread{
	//模拟用户账户
	private Account account;
	//当前取钱线程所希望取款的钱数
	private double depositAccount;
	
	public DepositThread(String name,Account account,double depositAmount){
		super(name);
		this.account = account;
		this.depositAccount = depositAmount;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++){
			account.deposit(depositAccount);
		}
	}
}
