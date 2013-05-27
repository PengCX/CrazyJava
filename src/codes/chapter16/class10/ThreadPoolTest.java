package codes.chapter16.class10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "iֵΪ:" + i);
		}
	}

}

public class ThreadPoolTest {
	public static void main(String[] args) {
		//����һ�����й̶��߳���(6)���̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//���̳߳����ύ�����߳�
		pool.submit(new TestThread());
		pool.submit(new TestThread());
		//�ر��̳߳�
		pool.shutdown();
	}
}
