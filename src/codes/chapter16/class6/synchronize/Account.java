package codes.chapter16.class6.synchronize;

public class Account {
	private String accountNo;
	private double balance;

	// ��ʶ�˻����Ƿ����д������
	private boolean flag = false;

	public Account() {

	}

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public synchronized void draw(double drawAccount) {
		try {
			// ���flagΪ��,�����˻��л�û�д���Ǯ���룬��ȡǮ�ķ�������
			if (!flag) {
				wait();
			} else {
				// ִ��ȡǮ
				System.out.println(Thread.currentThread().getName() + "ȡǮ��"
						+ drawAccount);
				balance -= drawAccount;
				System.out.println("�˻����Ϊ��" + balance);
				// ����ʶ�˻��Ƿ����д��������Ϊfalse
				flag = false;
				// ���������߳�
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void deposit(double depositAmount) {
		try {
			if (flag) {
				wait();
			} else {
				// ִ�д��
				System.out.println(Thread.currentThread().getName() + "��"
						+ depositAmount);
				balance += depositAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//��ʶ���˻��Ƿ����д����������Ϊtrue
				flag = true;
				//���������߳�
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
