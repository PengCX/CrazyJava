package codes.chapter9.class2;
/**
 * 9.2.1���巺�ͽӿڡ���
 * @author pengcx
 *
 */
//����Apple��ʱʹ���˷�������
public class Apple<T> {
	//����T���Ͳ�������ʵ������
	private T info;
	
	public Apple(){
		
	}
	
	//����ķ�����ʹ��T���Ͳ��������幹����
	public Apple(T info){
		this.info = info;
	}
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public T getInfo(){
		return this.info;
	}
	
	public static void main(String[] args){
		//��Ϊ���ݸ�T�βε���Stringʵ������
		//���Թ������Ĳ���ֻ����String
		Apple<String> a1 = new Apple<String>("ƻ��");
		System.out.println(a1.getInfo());
		
		//��Ϊ���ݸ�T�βε���Doubleʵ������
		//���й������Ĳ���ֻ����Integer
		Apple<Double> a2 = new Apple<Double>(5.67);
		System.out.println(a2.getInfo());
	}
}
