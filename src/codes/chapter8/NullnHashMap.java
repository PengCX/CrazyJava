package codes.chapter8;

import java.util.HashMap;

/**
 * ��ʾHashMap��null��֧��
 * 
 * @author pengcx
 * 
 */
public class NullnHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		// ��ͼ������keyΪnullֵ��key-value�Է���HashMap��
		hm.put(null, null);
		hm.put(null, null);
		//��һ��valueΪnullֵΪkey-value�Է���HashMap��
		hm.put("a", null);
		
		//���Map����
		System.out.println(hm);
	}

}
