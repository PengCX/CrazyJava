package codes.chapter8;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * �����޷�����Map�б��޸Ĺ���key
 * @author pengcx
 *
 */
public class HashtableErrorTest {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		//�˴���A����ǰһ�������A����ͬһ����
		ht.put(new A(6000), "���Java����");
		ht.put(new A(87563), "������Java EE��ҵӦ��ʵ��");
		//���Hashtable��key Set���϶�Ӧ��iterator
		Iterator it = ht.keySet().iterator();
		A first = (A) it.next();
		first.count = 87563;
		System.out.println(ht);
		//ֻ��ɾ��û�б��޸Ĺ���key����Ӧ��key-value��
		ht.remove(new A(87563));
		System.out.println(ht);
		
		//�޷���ȡʣ�µ�value�������д��붼���null
		System.out.println(ht.get(new A(87563)));
		System.out.println(ht.get(new A(6000)));
	}

}
