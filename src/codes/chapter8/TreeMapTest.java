package codes.chapter8;

import java.util.TreeMap;

/**
 * TreeMap����ʾ
 * 
 * @author pengcx
 * 
 */
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "������Java EE��ҵӦ��ʵս");
		tm.put(new R(-5), "���Java����");
		tm.put(new R(9), "���Android����");
		System.out.println(tm);
		
		//���ظ�TreeMap�ĵ�һ��Entry����
		System.out.println(tm.firstEntry());
		
		//���ظ�TreeMap�����һ��keyֵ
		System.out.println(tm.lastKey());
		
		//���ظ�TreeMap�ı�new R(2)�����Сkeyֵ
		System.out.println(tm.higherKey(new R(2)));
		
		//���ظ�TreeMap�ı�new R(2)С������key-value��
		System.out.println(tm.higherEntry(new R(2)));
		
		//���ظ�TreeMap����TreeMap
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

	// ����count���ж����������Ƿ����
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

	// ����count���ж���������Ĵ�С
	@Override
	public int compareTo(Object arg0) {
		R r = (R) arg0;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}
