package codes.chapter16.class5.synchronizedMethod;

public class Account {
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

	// �˴�ʡ����accountNo��sette��getter
	public synchronized void draw(double drawAmount) {
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

}
