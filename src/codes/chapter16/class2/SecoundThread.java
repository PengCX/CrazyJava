package codes.chapter16.class2;

/**
 * 通过实现Runnalbe接口来创建线程
 * 
 * @author Administrator
 * 
 */
public class SecoundThread implements Runnable {
	private int i;

	@Override
	public void run() {
		for (; i < 100; i++) {
			// 当线程类继承Thread时，可以直接使用getName()方法来返回当前线程的名。
			// 如果想获取当前线程，直接使用this即可。
			// Thread对象的getName()返回当前该线程的名字
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			//调用Thread的currentThread方法获取当前线程
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				SecoundThread st = new SecoundThread();
				//通过new Thread(target,name)方法创建新线程
				new Thread(st,"新线程1").start();
				new Thread(st,"新线程2").start();
			}
		}
	}
}
