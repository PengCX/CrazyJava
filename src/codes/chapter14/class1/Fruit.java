package codes.chapter14.class1;

public class Fruit {
	public void foo(){
		System.out.println("ˮ����info����������");
	}
}

class Apple extends Fruit
{
	//ʹ��@Overrideָ�����淽��������д���෽��
	@Override
	public void foo() {
		System.out.println("ƻ����дˮ����info����...");
	}
}

