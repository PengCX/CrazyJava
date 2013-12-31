package codes.chapter8;

import java.util.WeakHashMap;

/**
 * WeakHashMap演示
 * @author pengcx
 *
 */
public class WeakHashMapTest {

	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		//向WeakHashMap中添加三个key-value对
		//三个key都是匿名字符串对象（没有其它引用）
		whm.put(new String("语文"), new String("良好"));
		whm.put(new String("数学"), new String("及格"));
		whm.put(new String("英文"), new String("中等"));
		
		//向WeakHashMap中添加一个key-value对
		//该key是一个系统缓存的字符串对象
		whm.put("java", new String("中等"));
		//输出chm对象，看见4个对象
		System.out.println(whm);
		
		//通知系统立即收回垃圾
		System.gc();
		System.runFinalization();
		
		//通常情况下，将只看到一个key-value对
		System.out.println(whm);
	}

}
