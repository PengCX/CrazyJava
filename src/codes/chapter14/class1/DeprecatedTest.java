package codes.chapter14.class1;

class Apple1{
	//����info�����Ѿ���ʱ
	@Deprecated
	public void info(){
		System.out.println("Apple��info����");
	}
}

public class DeprecatedTest {
	public static void main(String[] args) {
		//����ʹ��info����ʱ���ᱻ����������
		new Apple1().info();
	}
}
