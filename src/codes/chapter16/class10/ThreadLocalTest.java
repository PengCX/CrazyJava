package codes.chapter16.class10;

class Account {
	//����һ��ThreadLocal���͵ı������ñ�������һ���̵߳ľֲ�����
	//ÿ���̶߳��ᱣ���ñ�����һ������
	private ThreadLocal<String> name = new ThreadLocal<String>();
	
	//����һ����ʼ��name���ԵĹ�����
	public Account(String str){
		this.name.set(str);
		//����Ĵ��뿴���������ʼ����
		System.out.println("===" + this.name.get());
	}
	
	//������name�����Ե�setter��getter����
	public String getName(){
		return name.get();
	}
	
	public void setName(String str){
		this.name.set(str);
	}
}

class MyTest extends Thread{
	//������һ��Account����
	private Account account;
	
	public MyTest(Account account,String name){
		super(name);
		this.account = account;
	}
	
	@Override
	public void run() {
		//ѭ��10��
		for(int i = 0; i < 10; i++){
			//��i==6ʱ������˻����滻�ɵ�ǰ�߳���
			if(i == 6){
				account.setName(getName());
			}
			//���ͬһ���˻����˻�����ѭ������
			System.out.println(account.getName() + "�˻���iֵ��" + i);
		}
	}
}

public class ThreadLocalTest{
	
	public static void main(String[] args) {
		//���������̣߳������̹߳���һ��Account
		Account at = new Account("��ʼ��");
		
		//��Ȼ�����̹߳���һ��Account����ֻ��һ���˻���
		//�������˻�����ThreadLocal���͵ģ����������߳̽�
		//������ͬһ��Account���������˻����ĸ�����ÿ���߳�
		//����ȫӵ�и����˻����ĸ��������Դ�i==6֮�󣬽���������
		//�̷߳���ͬһ���˻�ʱ������ͬ���˻���
		new MyTest(at,"�̼߳�").start();
		new MyTest(at,"�߳���").start();
	}	
}
