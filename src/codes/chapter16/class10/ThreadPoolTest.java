package codes.chapter16.class10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "i值为:" + i);
		}
	}

}

public class ThreadPoolTest {
	public static void main(String[] args) {
		//创建一个具有固定线程数(6)的线程池
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//向线程池中提交两个线程
		pool.submit(new TestThread());
		pool.submit(new TestThread());
		//关闭线程池
		pool.shutdown();
	}
}
