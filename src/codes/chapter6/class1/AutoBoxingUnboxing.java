package codes.chapter6.class1;
/**
 * 6.1Java7��ǿ�İ�װ���ͣ��Զ�װ����Զ�����
 * @author pengcx
 *
 */
public class AutoBoxingUnboxing {
	public static void main(String[] args){
		//�Զ�װ�䣺ֱ�Ӱ�һ���������͸�ֵ��Integer����
		Integer inObj = 5;
		
		//�Զ�װ�䣺ֱ�Ӱ�һ��boolean���ͱ�����ֵ��һ��Object���ͱ���
		Object boolObj = true;
		
		//�Զ����䣺ֱ�Ӱ�һ��Integer����ֵint���ͱ���
		int it = inObj;
		
		if(boolObj instanceof Boolean){
			//�Ȱ�Object����ǿ������ת����Boolean���ͣ��ڸ�ֵ��boolean����
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	}
}
