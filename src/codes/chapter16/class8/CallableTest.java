package codes.chapter16.class8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class RtnThread implements Callable<Integer> {

	// ʵ��call��������Ϊ�߳�ִ����
	@Override
	public Integer call() throws Exception {
		int i = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "��ѭ������i��ֵ��"
					+ i);
		}
		//call()���������з���ֵ
		return i;
	}

}

public class CallableTest {
	public static void main(String[] args) {
		//����Callable����
		RtnThread rt = new RtnThread();
		//ʹ��FutureTask���װCallable����
		FutureTask<Integer> task = new FutureTask<Integer>(rt);
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName() + "��ѭ������i��ֵ��" + i);
			
			if(i == 20){
				//ʵ�ʻ�����Callable�������������������߳�
				new Thread(task, "�з���ֵ���߳�").start();
			}
		}
		
		try {
			//��ȡ���̵߳ķ���ֵ��task.get()�����������߳�������ֱ��call()��������������Ϊֹ
			System.out.println("���̵߳ķ���ֵ��" + task.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
