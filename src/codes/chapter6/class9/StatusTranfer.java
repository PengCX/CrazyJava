package codes.chapter6.class9;

public class StatusTranfer {
	public static void test() {
		// ������һ������a,ָ��������Java EE��ҵӦ��ʵս���ַ��������ַ������ڿɴ�״̬
		String a = new String("������Java EE��ҵӦʵս");
		// ���붨���ˡ����Java���塰�ַ������󣬲���a����ָ��ö��󣬴�ʱ��������Java
		// EE��ҵӦ��ʵս���ַ������ڻָ�״̬�������Java���塰�ַ������ڿɴ�״̬
		a = new String("���Java����");
	}

	public static void main(String[] args) {
		test();
	}
}
