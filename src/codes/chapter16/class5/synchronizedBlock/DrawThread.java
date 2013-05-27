package codes.chapter16.class5.synchronizedBlock;

import codes.chapter16.class5.Account;

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
		//使用account作为同步监视器，任何线程进入下面同步代码之前，
		//必须先获得对account账户的锁定——其它线程无法获得锁，也无法修改它
		//这种做法符合：加锁——>修改完成——>释放锁的逻辑
		synchronized (account) {
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
}
