package codes.chapter16.class4;

public class DemoThread extends Thread {
	//定义后台线程的执行体和普通线程没有任何区别
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		DemoThread t = new DemoThread();
		
		//将此线程设置为后台线程
		t.setDaemon(true);
		//启动后台线程
		t.start();
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		//-----程序执行到此处，前台线程（main线程）结束-----
		//后台线程也应该随之结束
	}
}
