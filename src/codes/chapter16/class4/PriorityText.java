package codes.chapter16.class4;

public class PriorityText extends Thread {
	public PriorityText() {

	}

	public PriorityText(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + ",其优先级是：" + getPriority()
					+ ",循环变量的值为：" + i);
		}
	}
	
	public static void main(String[] args) {
		//改变主线程的优先级
		Thread.currentThread().setPriority(6);
		
		for(int i = 0; i < 30; i++){
			if(i == 10){
				PriorityText low = new PriorityText("低级");
				low.start();
				System.out.println("创建之初的优先级：" + low.getPriority());
				//设置线程为最低优先级
				low.setPriority(Thread.MIN_PRIORITY);
			}
			
			if(i == 20){
				PriorityText high = new PriorityText("高级");
				high.start();
				System.out.println("创建之初的优先级：" + high.getPriority());
				//设置线程为最高优先级
				high.setPriority(Thread.MAX_PRIORITY);
			}
		}
	}
}
