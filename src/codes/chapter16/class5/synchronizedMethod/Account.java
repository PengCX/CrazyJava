package codes.chapter16.class5.synchronizedMethod;

public class Account {
	// 封装账户编号、账户余额两个属性
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

	// 此处省略了accountNo的sette和getter
	public synchronized void draw(double drawAmount) {
		// 账户余额大于取钱数目
		if (balance >= drawAmount) {
			System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票："
					+ drawAmount);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 修改余额
			balance -= drawAmount;
			System.out.println("\t余额为：" + balance);
		} else {
			System.out.println(Thread.currentThread().getName()
					+ "取钱余额不足，余额不足!");
		}
	}

}
