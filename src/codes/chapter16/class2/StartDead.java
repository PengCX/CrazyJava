package codes.chapter16.class2;

public class StartDead extends Thread {
	private int i;
	
	//��дrun������run�����ķ���������߳�ִ����
	@Override
	public void run() {
		for(; i < 100 ; i++){
			//���̼̳߳�Thread��ʱ������ֱ�ӵ���getName()���������ص�ǰ�̵߳�����
			//�����ȡ��ǰ�̣߳�ֱ��ʹ��this����
			//Thread�����getName()���ص�ǰ���̵߳�����
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		//�����̶߳���
		StartDead sd = new StartDead();
		
		for(int i = 0; i < 300; i++){
			//����Thread��currentThread������ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			if(i == 20){
				//�����߳�
				sd.start();
				//�ж��߳��������̵߳�isAlive()ֵ�����true
				System.out.println(sd.isAlive());
			}
			
			//ֻ�е��̴߳����½�����������״̬ʱisAlive��������false
			//��Ϊi>20������߳��Ѿ������ˣ�����ֻ����������״̬��
			if(i > 20 && !sd.isAlive()){
				//��ͼ�ٴ��������߳�
				sd.start();
			}
		}
	}
}
