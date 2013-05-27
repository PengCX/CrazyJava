package codes.chapter16.class6.synchronize;

public class DepositThread extends Thread{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ���Ǯ��
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
