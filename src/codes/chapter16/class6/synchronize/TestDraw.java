package codes.chapter16.class6.synchronize;

public class TestDraw {
	public static void main(String[] args) {
		// ����һ���˻�
		Account account = new Account("1234567", 0);
		new DrawThread("ȡǮ��", account, 800).start();
		new DepositThread("����߼�", account, 800).start();
		new DepositThread("�������", account, 800).start();
		new DepositThread("����߱�", account, 800).start();
	}
}
