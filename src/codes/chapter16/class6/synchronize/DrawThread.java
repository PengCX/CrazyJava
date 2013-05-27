package codes.chapter16.class6.synchronize;

public class DrawThread extends Thread{
	//ģ���û��˻�
	private Account account;
	//��ǰȡǮ�߳���ϣ��ȡ��Ǯ
	private double drawAmount;
	
	public DrawThread(String name,Account account,double drawAmount){
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	@Override
	public void run() {
		//�ظ�100��ִ��ȡǮ����
		for(int i = 0; i < 100; i++){
			account.draw(drawAmount);
		}
	}
}
