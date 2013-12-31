package codes.chapter8;

import java.util.IdentityHashMap;

/**
 * IdentifyHashMap演示:当key1==key2时，才相等。
 * @author pengcx
 *
 */
public class IdentifyHashMapTest {

	public static void main(String[] args) {
		IdentityHashMap ihm = new IdentityHashMap();
		//下面两行代码将会向IdentityHashMap对象将添加两个key-value对
		ihm.put(new String("语文"), 89);
		ihm.put(new String("语文"), 89);
		//下面两行代码将会向IdentityHashMap对象添加一个key-value对
		ihm.put("java", 93);
		ihm.put("java", 93);
		
		System.out.println(ihm);
	}

}
