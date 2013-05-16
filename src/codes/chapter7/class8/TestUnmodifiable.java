package codes.chapter7.class8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/**
 * Collections���ò��ɱ伯��
 * @author Administrator
 *
 */
public class TestUnmodifiable {
	public static void main(String[] args) {
		//����һ���յġ����ɸı��List����
		List unmodifiableList = Collections.emptyList();
		
		//java.lang.UnsupportedOperationException
		//unmodifiableList.add(1);
		System.out.println(unmodifiableList);
		
		//����һ��ֻ��һ��Ԫ�أ��Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("Struts2Ȩ��ָ��");
		//java.lang.UnsupportedOperationException
		//unmodifiableSet.add("aa");
		System.out.println(unmodifiableSet);
		
		//����һ����ͨMap����
		Map scores = new HashMap();
		scores.put("����", 90);
		scores.put("Java", 80);
		//������ͨMap�������Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//��������һ�д���ӡ��UnsupportedOperationException�쳣
		unmodifiableList.add("����Ԫ��");
		unmodifiableSet.add("����Ԫ��");
		unmodifiableMap.put("����",30);
	}
}
