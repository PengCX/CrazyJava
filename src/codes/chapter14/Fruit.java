package codes.chapter14;
/**
 *  @Overide:
 *  	1.ָ���������صģ�������ǿ��һ�����������Ҫ���Ǹ���ķ���
 *  	2.ֻ�����������ڷ���������������������������Ԫ��
 * @author pengcx
 *
 */
public class Fruit {
	public void foo(){
		System.out.println("ˮ����info����");
	}

}

class Apple extends Fruit {
	//ʹ��@Override�ƶ����淽��������д���෽��
	@Override
	public void foo(){
		System.out.println("ƻ����дˮ����info�ķ���...");
	}
}
