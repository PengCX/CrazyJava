package codes.chapter9.class2;
/**
 * 9.2.2�ӷ�������������
 * @author pengcx
 *
 */
public class A2 extends Apple{
	//��д���෽��
	public String getInfo(){
		//super.getInfo()��������ֵ��Object����
		//���Լ�toString()�ŷ���String����
		return super.getInfo().toString();
	}
}
