package codes.chapter16.class5;

public class TestDraw {
	public static void main(String[] args) {
		// 创建一个账户
		codes.chapter16.class5.Lock.Account acct = new codes.chapter16.class5.Lock.Account(
				"1234567", 1000);
		// 模拟两个线程对同一个账户取钱
		new codes.chapter16.class5.Lock.DrawThread("甲", acct, 800).start();
		new codes.chapter16.class5.Lock.DrawThread("乙", acct, 800).start();
	}
}
