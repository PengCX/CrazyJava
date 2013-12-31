package codes.chapter8;

import java.util.HashMap;

/**
 * 演示HashMap对null的支持
 * 
 * @author pengcx
 * 
 */
public class NullnHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		// 视图将两个key为null值的key-value对放入HashMap中
		hm.put(null, null);
		hm.put(null, null);
		//将一个value为null值为key-value对放入HashMap中
		hm.put("a", null);
		
		//输出Map对象
		System.out.println(hm);
	}

}
