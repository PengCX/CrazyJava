package codes.chapter16.class6.synchronize;

public class Account {
	private String accountNo;
	private double balance;

	// 标识账户中是否已有存款的旗标
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
			// 如果flag为假,表明账户中还没有存入钱进入，则取钱的方法阻塞
			if (!flag) {
				wait();
			} else {
				// 执行取钱
				System.out.println(Thread.currentThread().getName() + "取钱："
						+ drawAccount);
				balance -= drawAccount;
				System.out.println("账户余额为：" + balance);
				// 将标识账户是否已有存款的旗标设为false
				flag = false;
				// 唤醒其它线程
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
				// 执行存款
				System.out.println(Thread.currentThread().getName() + "存款："
						+ depositAmount);
				balance += depositAmount;
				System.out.println("账户余额为：" + balance);
				//标识此账户是否已有存款的旗标设置为true
				flag = true;
				//唤醒其它线程
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
