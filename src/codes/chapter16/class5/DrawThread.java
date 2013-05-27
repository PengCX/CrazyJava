package codes.chapter16.class5;

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
		// �˻�������ȡǮ��Ŀ
		if (account.getBalance() >= drawAmount) {
			System.out.println(getName() + "ȡǮ�ɹ����³���Ʊ��" + drawAmount);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// �޸����
			account.setBalance(account.getBalance() - drawAmount);
			System.out.println("\t���Ϊ��" + account.getBalance());
		} else {
			System.out.println(getName() + "ȡǮ���㣬����!");
		}
	}
}
