package codes.chapter8;

import java.util.EnumMap;
/**
 * EnumMap����ʾ
 * @author pengcx
 *
 */
public class EnumMapTest {

	public static void main(String[] args) {
		//����һ��EnumMap���󣬸�EnumMap������key
		//����Seasonö�����ö��
		EnumMap enumMap = new EnumMap(Sesson.class);
		enumMap.put(Sesson.SUMMER, "��������");
		enumMap.put(Sesson.SPRING, "��ů����");
		
		System.out.println(enumMap);
	}

}

enum Sesson{
	SUMMER,SPRING
}
