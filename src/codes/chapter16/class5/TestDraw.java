package codes.chapter16.class5;

public class TestDraw {
	public static void main(String[] args) {
		// ����һ���˻�
		codes.chapter16.class5.Lock.Account acct = new codes.chapter16.class5.Lock.Account(
				"1234567", 1000);
		// ģ�������̶߳�ͬһ���˻�ȡǮ
		new codes.chapter16.class5.Lock.DrawThread("��", acct, 800).start();
		new codes.chapter16.class5.Lock.DrawThread("��", acct, 800).start();
	}
}
