package codes.chapter16.class4;

public class PriorityText extends Thread {
	public PriorityText() {

	}

	public PriorityText(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + ",�����ȼ��ǣ�" + getPriority()
					+ ",ѭ��������ֵΪ��" + i);
		}
	}
	
	public static void main(String[] args) {
		//�ı����̵߳����ȼ�
		Thread.currentThread().setPriority(6);
		
		for(int i = 0; i < 30; i++){
			if(i == 10){
				PriorityText low = new PriorityText("�ͼ�");
				low.start();
				System.out.println("����֮�������ȼ���" + low.getPriority());
				//�����߳�Ϊ������ȼ�
				low.setPriority(Thread.MIN_PRIORITY);
			}
			
			if(i == 20){
				PriorityText high = new PriorityText("�߼�");
				high.start();
				System.out.println("����֮�������ȼ���" + high.getPriority());
				//�����߳�Ϊ������ȼ�
				high.setPriority(Thread.MAX_PRIORITY);
			}
		}
	}
}
