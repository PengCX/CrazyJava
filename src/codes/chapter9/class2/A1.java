package codes.chapter9.class2;
/**
 * 9.2.2�ӷ�������������
 * @author pengcx
 *
 */
public class A1 extends Apple<String>{
	//��ȷ��д����ķ���������ֵ
	//�븸��Apple<String>�ķ���ֵ��ȫ��ͬ
	public String getInfo(){
		return "����" + super.getInfo();
	}
	
	//����ķ����Ǵ���ģ���д����ķ���ʱ����ֵ���Ͳ�һ��
//	public Object getInfo(){
//		return "����";
//	}
}

