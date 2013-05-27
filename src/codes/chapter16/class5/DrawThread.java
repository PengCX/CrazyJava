package codes.chapter16.class5;

public class DrawThread extends Thread {
	// 模拟用户账户
	private Account account;
	// 当前取钱线程所希望取的钱数
	private double drawAmount;

	// 当多条线程共享数据时，将涉及数据安全问题
	public DrawThread(String name, Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	@Override
	public void run() {
		// 账户余额大于取钱数目
		if (account.getBalance() >= drawAmount) {
			System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// 修改余额
			account.setBalance(account.getBalance() - drawAmount);
			System.out.println("\t余额为：" + account.getBalance());
		} else {
			System.out.println(getName() + "取钱余额不足，余额不足!");
		}
	}
}
