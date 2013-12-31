package codes.chapter8;

import java.util.TreeMap;

/**
 * TreeMap的演示
 * 
 * @author pengcx
 * 
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "轻量级Java EE企业应用实战");
		tm.put(new R(-5), "疯狂Java讲义");
		tm.put(new R(9), "疯狂Android讲义");
		System.out.println(tm);
		
		//返回该TreeMap的第一个Entry对象
		System.out.println(tm.firstEntry());
		
		//返回该TreeMap的最后一个key值
		System.out.println(tm.lastKey());
		
		//返回该TreeMap的比new R(2)大的最小key值
		System.out.println(tm.higherKey(new R(2)));
		
		//返回该TreeMap的比new R(2)小的最大的key-value对
		System.out.println(tm.higherEntry(new R(2)));
		
		//返回该TreeMap的子TreeMap
		System.out.println(tm.subMap(new R(-1), new R(10)));
		
	}
}

class R implements Comparable {
	int count;

	public R(int count) {
		super();
		this.count = count;
	}

	@Override
	public String toString() {
		return "R[count:" + count + "";
	}

	// 根据count来判断两个对象是否相等
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj != null && obj.getClass() == R.class) {
			R r = (R) obj;
			return this.count == r.count;
		}
		return false;
	}

	// 根据count来判断两个对象的大小
	@Override
	public int compareTo(Object arg0) {
		R r = (R) arg0;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}
