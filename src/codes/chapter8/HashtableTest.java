package codes.chapter8;

import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new A(6000), "����Java����");
		ht.put(new A(87563), "������Java EE��ҵӦ��ʵս");
		ht.put(new A(1232), new B());
		System.out.println(ht);
		//ֻҪ��������ͨ��equals()�����ȽϷ���ture
		//Hashtable����Ϊ��������ȵ�value
		//����Hashtable����һ������B
		//�����κζ���ͨ��equals()�����Ƚ϶���ȣ������������true
		System.out.println(ht.contains("�����ַ���"));
		//ֻҪ����A������ȣ�����ͨ��equals�����ȽϷ���true����hashCodeֵ���
		//Hashtalbe����Ϊ��������ͬ��key�������������true
		System.out.println(ht.containsKey(new A(87563)));
		//�����������ɾ�����һ��key-value��
		ht.remove(new A(1232));
		
		//ͨ������Hashtable������key��ɵ�Set����
		//�Ӷ�����Hashtable��ÿ��key-value��
		for(Object key:ht.keySet()){
			System.out.println(key + "---->");
			System.out.println(ht.get(key) + "\n");
		}
	}

}

class A{
	int count;
	public A(int count){
		this.count = count;
	}
	
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		
		if(obj != null && obj.getClass() == A.class){
			A a = (A)obj;
			return this.count == a.count;
		}
		
		return false;
	}
	
	public int hashCode(){
		return this.count;
	}
}

class B{
	public boolean equals(Object obj){
		return true;
	}
}
