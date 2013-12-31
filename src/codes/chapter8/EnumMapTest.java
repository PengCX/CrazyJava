package codes.chapter8;

import java.util.EnumMap;
/**
 * EnumMap的演示
 * @author pengcx
 *
 */
public class EnumMapTest {

	public static void main(String[] args) {
		//创建一个EnumMap对象，该EnumMap的所有key
		//必须Season枚举类的枚举
		EnumMap enumMap = new EnumMap(Sesson.class);
		enumMap.put(Sesson.SUMMER, "夏日炎炎");
		enumMap.put(Sesson.SPRING, "春暖花开");
		
		System.out.println(enumMap);
	}

}

enum Sesson{
	SUMMER,SPRING
}
