package codes.chapter16.class5.Lock;

import codes.chapter16.class5.Lock.Account;

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
		// 直接调用account对象的draw方法来执行取钱
		account.draw(drawAmount);
	}
}
