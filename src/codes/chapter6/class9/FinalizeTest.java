package codes.chapter6.class9;

public class FinalizeTest {
	private static FinalizeTest ft = null;
	public void info(){
		System.out.println("������Դ�����finalize����");
	}
	
	public static void main(String[] args)throws Exception{
		//����FinalizeTest������������ɻָ�״̬
		new FinalizeTest();
		//֪ͨϵͳ������Դ����
		System.gc();
		//�ó���ͣ2��
		Thread.sleep(20000);
		ft.info();
	}
	
	public void finalize(){
		//��ft���õ���ͼ���յĿɻָ����󣬿ɻָ��������±�ɿɴ�״̬
		ft = this;
	}
}
