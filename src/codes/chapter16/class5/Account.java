package codes.chapter16.class5;

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

	public void setBalance(double balance) {
		this.balance = balance;
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
}
