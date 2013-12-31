package codes.chapter16.class8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 
 * @author pengcx
 * 
 */
public class ThreadPoolTest {
	public static void main(String[] args) throws Exception {
		//创建一个具有固定线程数（6）的线程池
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//向线程池中提交两个线程
		pool.submit(new MyThread());
		pool.submit(new MyThread());
		//关闭线程池
		pool.shutdown();
	}
}

/**
 * 实现Runnable接口来定义一个简单的线程类
 * 
 * @author pengcx
 * 
 */
class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "i的值为：" + i);
		}
	}

}