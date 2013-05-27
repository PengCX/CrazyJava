package codes.chapter16.class7;

class TestThread extends Thread{
	//�ṩָ���߳����Ĺ�����
	public TestThread(String name) {
		super(name);
	}
	
	//�ṩָ���߳������߳���Ĺ�����
	public TestThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++){
			System.out.println(getName() + "�̵߳�i����" + i);
		}
	}
	
}

public class ThreadGroupTest {
	public static void main(String[] args) {
		//��ȡ���߳����ڵ��߳��飬���������߳�Ĭ�ϵ��߳���
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("���߳�������֣�" + mainGroup.getName());
		
		System.out.println("���߳����Ƿ��Ǻ�̨�߳��飺" + mainGroup.isDaemon());
		ThreadGroup tg = new ThreadGroup("���߳���");
		tg.setDaemon(true);
		System.out.println("tg�߳����Ƿ��Ǻ�̨�߳��飺" + tg.isDaemon());
		TestThread tt = new TestThread(tg,"tg����̼߳�");
		tt.start();
		new TestThread(tg,"tg����߳���").start();
	}
}
