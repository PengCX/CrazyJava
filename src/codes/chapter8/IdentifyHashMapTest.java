package codes.chapter8;

import java.util.IdentityHashMap;

/**
 * IdentifyHashMap��ʾ:��key1==key2ʱ������ȡ�
 * @author pengcx
 *
 */
public class IdentifyHashMapTest {

	public static void main(String[] args) {
		IdentityHashMap ihm = new IdentityHashMap();
		//�������д��뽫����IdentityHashMap�����������key-value��
		ihm.put(new String("����"), 89);
		ihm.put(new String("����"), 89);
		//�������д��뽫����IdentityHashMap�������һ��key-value��
		ihm.put("java", 93);
		ihm.put("java", 93);
		
		System.out.println(ihm);
	}

}
