package codes.chapter16.class4;

public class DemoThread extends Thread {
	//�����̨�̵߳�ִ�������ͨ�߳�û���κ�����
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		DemoThread t = new DemoThread();
		
		//�����߳�����Ϊ��̨�߳�
		t.setDaemon(true);
		//������̨�߳�
		t.start();
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		//-----����ִ�е��˴���ǰ̨�̣߳�main�̣߳�����-----
		//��̨�߳�ҲӦ����֮����
	}
}
