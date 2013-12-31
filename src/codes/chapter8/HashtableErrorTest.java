package codes.chapter8;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * 程序无法访问Map中被修改过的key
 * @author pengcx
 *
 */
public class HashtableErrorTest {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		//此处的A类与前一个程序的A类是同一个类
		ht.put(new A(6000), "疯狂Java讲义");
		ht.put(new A(87563), "轻量级Java EE企业应用实践");
		//获得Hashtable的key Set集合对应的iterator
		Iterator it = ht.keySet().iterator();
		A first = (A) it.next();
		first.count = 87563;
		System.out.println(ht);
		//只能删除没有被修改过的key所对应的key-value对
		ht.remove(new A(87563));
		System.out.println(ht);
		
		//无法获取剩下的value下面两行代码都输出null
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(6000)));
	}

}
