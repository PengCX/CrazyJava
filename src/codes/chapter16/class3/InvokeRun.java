package codes.chapter16.class3;

public class InvokeRun extends Thread{
	private int i;
	
	@Override
	public void run() {
		for(; i < 100; i++){
			//�ֽڵ���run����ʱ��Thread��this.getName���ص��¸ö�������
			//�����ǵ�ǰ�̵߳����֡�
			//ʹ��Thread.currentThread()��getName()���ǻ�ȡ��ǰ�̵߳�����
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i == 20){
				//ֱ�ӵ����̶߳����run����
				//ϵͳ����̶߳��󵱳���ͨ����run����������ͨ����
				//�����������д��벢�������������̣߳���������ִ��run����
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}
}
