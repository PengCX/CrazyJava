package codes.chapter6.class9;

public class FinalizeTest2 {
	private static FinalizeTest2 ft = null;
	private void info(){
		System.out.println("������Դ�����finalize����");
	}
	
	public static void main(String[] args)throws Exception{
		//����TestFinalize������������ɻָ�״̬
		new FinalizeTest2();
		//֪ͨϵͳ������Դ����
		System.gc();
		//ǿ���������ջ��Ƶ��ÿɻָ������finalize����
		Runtime.getRuntime().runFinalization();
		ft.info();
	}
	
	public void finalize(){
		//��ft���õ���ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�״̬
		ft = this;
	}
}
