package codes.chapter8;

import java.util.Hashtable;

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new A(6000), "疯狂的Java讲义");
		ht.put(new A(87563), "轻量级Java EE企业应用实战");
		ht.put(new A(1232), new B());
		System.out.println(ht);
		//只要两个对象通过equals()方法比较返回ture
		//Hashtable就认为它们是相等的value
		//由于Hashtable中有一个对象B
		//它和任何对象通过equals()方法比较都相等，所以下面输出true
		System.out.println(ht.contains("测试字符串"));
		//只要两个A对象相等，它们通过equals方法比较返回true，且hashCode值相等
		//Hashtalbe即认为它们是相同的key，所以下面输出true
		System.out.println(ht.containsKey(new A(87563)));
		//下面的语句可以删除最后一个key-value对
		ht.remove(new A(1232));
		
		//通过返回Hashtable的所有key组成的Set集合
		//从而遍历Hashtable的每个key-value对
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
