package codes.chapter16.class2;

/**
 * ͨ��ʵ��Runnalbe�ӿ��������߳�
 * 
 * @author Administrator
 * 
 */
public class SecoundThread implements Runnable {
	private int i;

	@Override
	public void run() {
		for (; i < 100; i++) {
			// ���߳���̳�Threadʱ������ֱ��ʹ��getName()���������ص�ǰ�̵߳�����
			// ������ȡ��ǰ�̣߳�ֱ��ʹ��this���ɡ�
			// Thread�����getName()���ص�ǰ���̵߳�����
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				SecoundThread st = new SecoundThread();
				//ͨ��new Thread(target,name)�����������߳�
				new Thread(st,"���߳�1").start();
				new Thread(st,"���߳�2").start();
			}
		}
	}
}
