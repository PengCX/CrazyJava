package codes.chapter6.class1;
/**
 * 6.1Java7��ǿ�İ�װ�ࣺ�˴��װ����
 * @author pengcx
 *
 */
public class Primitive2Wrapper {
	public static void main(String[] args){
		boolean b1 = true;
		//ͨ����������b1�������ͱ�����װ�ɰ�װ�����
		Boolean blobj = new Boolean(b1);
		
		int it = 5;
		//ͨ����������it�������ͱ�����װ�ɰ�װ�����
		Integer itObj = new Integer(it);
		
		//��һ���ַ���ת����Float����
		Float f1 = new Float("4.56");
		//��һ���ַ���ת����Boolean����
		Boolean bObj = new Boolean("false");
		
		//����ĳ�������ʱ������java.lang.NumberFormatException�쳣
		Long lObj = new Long("ddd");
	}
}
