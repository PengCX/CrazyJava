package codes.chapter16.class8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * 
 * @author pengcx
 * 
 */
public class ThreadPoolTest {
	public static void main(String[] args) throws Exception {
		//����һ�����й̶��߳�����6�����̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(6);
		//���̳߳����ύ�����߳�
		pool.submit(new MyThread());
		pool.submit(new MyThread());
		//�ر��̳߳�
		pool.shutdown();
	}
}

/**
 * ʵ��Runnable�ӿ�������һ���򵥵��߳���
 * 
 * @author pengcx
 * 
 */
class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "i��ֵΪ��" + i);
		}
	}

}