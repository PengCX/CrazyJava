package codes.chapter8;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap的演示:使用双向地链表保留插入顺序
 * @author pengcx
 *
 */
public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("英语", 70);
		scores.put("语文", 90);
		scores.put("数学", 80);
		
		//遍历sources里的所有key-value
		for(Object key:scores.keySet()){
			System.out.println(key + "---->" + scores.get(key));
		}
	}

}
