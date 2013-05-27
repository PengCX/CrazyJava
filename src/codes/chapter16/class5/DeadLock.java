package codes.chapter16.class5;

class A {
	public synchronized void foo(B b) {
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName()
				+ "������Aʵ����foo����");

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName()
				+ "��ͼ����Bʵ����last����");
	}
	
	public synchronized void last(){
		System.out.println("����A���last�����ڲ�");
	}
}

class B {
	public synchronized void bar(A a) {
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName() + "����Bʵ����bar����");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��ǰ�߳�����" + Thread.currentThread().getName()
				+ "��ͼ����Aʵ����last����");
		
	}
	public synchronized void last(){
		System.out.println("����B���last�����ڲ�");
	}
}

public class DeadLock implements Runnable{
	A a = new A();
	B b = new B();
	
	public void init(){
		Thread.currentThread().setName("���߳�");
		//����a�����foo����
		a.foo(b);
		System.out.println("�������߳�֮��");
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("���߳�");
		//����b�����bar����
		b.bar(a);
		System.out.println("���븱�߳�֮��");
	}
	
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		//��dlΪtarget�����µ��߳�
		new Thread(dl).start();
		//ִ��init������Ϊ���߳�
		dl.init();
	}
}
