package codes.chapter16.class4;

public class TestYield extends Thread {
	public TestYield() {
		
	}

	public TestYield(String name) {
		super(name);
	}
	
	//����run������Ϊ�߳�ִ����
	@Override
	public void run() {
		for(int i = 0; i < 50; i++){
			System.out.println(getName() + " " + i);
			//��i����20ʱ��ʹ��yield�����õ�ǰ�߳��ò�
			if(i == 20){
				Thread.yield();
			}
		}
	}
	
	public static void main(String[] args) {
		//�������������߳�
		TestYield ty1 = new TestYield("�߼�");
		//��ty1�߳�����������ȼ�
		ty1.setPriority(Thread.MAX_PRIORITY);
		ty1.start();
		
		TestYield ty2 = new TestYield("�ͼ�");
		//��ty2���ó�������ȼ�
		ty2.setPriority(Thread.MIN_PRIORITY);
		ty2.start();
	}
}
