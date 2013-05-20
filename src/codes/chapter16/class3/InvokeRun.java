package codes.chapter16.class3;

public class InvokeRun extends Thread{
	private int i;
	
	@Override
	public void run() {
		for(; i < 100; i++){
			//字节调用run方法时，Thread的this.getName返回的事该对象名字
			//而不是当前线程的名字。
			//使用Thread.currentThread()。getName()总是获取当前线程的名字
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			//调用Thread的currentThread方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				//直接调用线程对象的run方法
				//系统会把线程对象当成普通对象，run方法当成普通方法
				//所以下面两行代码并不会启动两条线程，而是依次执行run方法
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}
}
