package codes.chapter16.class5.Lock;

import codes.chapter16.class5.Lock.Account;

public class DrawThread extends Thread {
	// ģ���û��˻�
	private Account account;
	// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;

	// �������̹߳�������ʱ�����漰���ݰ�ȫ����
	public DrawThread(String name, Account account, double drawAmount) {
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	@Override
	public void run() {
		// ֱ�ӵ���account�����draw������ִ��ȡǮ
		account.draw(drawAmount);
	}
}
