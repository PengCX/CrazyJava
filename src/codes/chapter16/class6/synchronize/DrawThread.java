package codes.chapter16.class6.synchronize;

public class DrawThread extends Thread{
	//模拟用户账户
	private Account account;
	//当前取钱线程所希望取的钱
	private double drawAmount;
	
	public DrawThread(String name,Account account,double drawAmount){
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}
	
	@Override
	public void run() {
		//重复100次执行取钱操作
		for(int i = 0; i < 100; i++){
			account.draw(drawAmount);
		}
	}
}
