package codes.chapter16.class5.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private final ReentrantLock lock = new ReentrantLock();
	
	// ��װ�˻���š��˻������������
	private String accountNo;
	private double balance;

	public Account() {
		super();
	}

	public Account(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public int hashCode() {
		return accountNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj.getClass() == Account.class) {
			Account target = (Account) obj;
			return target.getAccountNo().equals(accountNo);
		}
		return false;
	}
	
	public void draw(double drawAmount) {
		//��ͬ�������м���
		lock.lock();
		
		try {
			// �˻�������ȡǮ��Ŀ
			if (balance >= drawAmount) {
				System.out.println(Thread.currentThread().getName() + "ȡǮ�ɹ����³���Ʊ��"
						+ drawAmount);

				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				// �޸����
				balance -= drawAmount;
				System.out.println("\t���Ϊ��" + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ "ȡǮ���㣬����!");
			}
		} 
		//ʹ��finally����ȷ���ͷ���
		finally{
			lock.unlock();
		}
	}
}
