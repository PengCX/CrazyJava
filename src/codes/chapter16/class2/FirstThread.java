package codes.chapter16.class2;
/**
 * ͨ��Thread���������߳���
 * @author Administrator
 *
 */
public class FirstThread extends Thread {
	private int i;
	
	//��дrun������run�����ķ���������߳��塣
	@Override
	public void run() {
		for(;i < 100; i++){
			//���߳���̳�Threadʱ������ֱ��ʹ��getName()���������ص�ǰ�̵߳�����
			//������ȡ��ǰ�̣߳�ֱ��ʹ��this���ɡ�
			//Thread�����getName()���ص�ǰ���̵߳�����
			System.out.println(getName() + " " + i);
		}
	}
	
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				//����������һ���߳�
				new FirstThread().start();
				//�����������ڶ����߳�
				new FirstThread().start();
			}
		}
	}
}
