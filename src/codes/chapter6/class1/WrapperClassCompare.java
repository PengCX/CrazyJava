package codes.chapter6.class1;

/**
 * 6.1Java7��ǿ�İ�װ����
 * 
 * @author pengcx
 * 
 */
public class WrapperClassCompare {
	public static void main(String[] args) {
		// ֱ��ȡ����װ����ʵ������װ��ֵ���бȽ�
		Integer a = new Integer(6);
		System.out.println("6�İ�װ�����Ƿ����5.0��" + (a > 5.0));

		// ������װ���͵�ֵ���бȽ�(�����µĶ���)
		System.out.println("�Ƚ�2����װ���͵�ʵ���Ƿ���ȣ�"
				+ (new Integer(2) == new Integer(2)));
		
		//ͨ���Զ�װ�䣬����ѻ�������ֵ��ֵ����װ����ʵ��(��ȡ�����ػ���)
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("����2�Զ�װ����Ƿ���ȣ�" + (ina == inb));
		Integer big1 = 128;
		Integer big2 = 128;
		System.out.println("����128�Զ�װ����Ƿ���ȣ�" + (big1 == big2));
	
//		System.out.println(Boolean.compare(true,false));
//		System.out.println(Boolean.compare(true,ture));
//		System.out.println(Boolean.compare(false,true));
	}
}
