package codes.chapter8;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap����ʾ:ʹ��˫�������������˳��
 * @author pengcx
 *
 */
public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("Ӣ��", 70);
		scores.put("����", 90);
		scores.put("��ѧ", 80);
		
		//����sources�������key-value
		for(Object key:scores.keySet()){
			System.out.println(key + "---->" + scores.get(key));
		}
	}

}
