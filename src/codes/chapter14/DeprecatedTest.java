package codes.chapter14;
/**
 * @Deprecated:
 * 	1.���ڱ�ʾĳ������Ԫ�أ��ࡢ�����ȣ��ѹ�ʱ������������ʹ���ѹ�ʱ���ࡢ����ʱ������������������档
 * @author pengcx
 *
 */
public class DeprecatedTest {

	public static void main(String[] args) {
		//����ʹ��info����ʱ���ᱻ����������
		new Apple1().info();
	}
}

class Apple1{
	//����info�����ѹ�ʱ
	@Deprecated
	public void info(){
		System.out.println("Apple��info����");
	}
}
