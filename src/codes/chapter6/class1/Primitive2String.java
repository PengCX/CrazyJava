package codes.chapter6.class1;
/**
 * 6.2Java7增强的包装类型：基本类型和字符串之间的转换
 * @author pengcx
 *
 */
public class Primitive2String {
	public static void main(String[] args){
		String intStr = "123";
		//把一个特定字符串转换成int变量
		int it1 = Integer.parseInt(intStr);
		int it2 = new Integer(intStr);
		System.out.println(it2);
		
		String floatStr = "4.56";
		//把一个特定字符串转换成float变量
		float ft1 = Float.parseFloat(floatStr);
		float ft2 = new Float(floatStr);
		System.out.println(ft2);
		
		//把一个float变量转换成String变量
		String ftStr = String.valueOf(2.234f);
		System.out.println(ftStr);
		
		//把一个double变量转换成String变量
		String dbStr = String.valueOf(3.334);
		System.out.println(dbStr);
		
		//把一个boolean变量转换成String变量
		String boolStr = String.valueOf(true);
		System.out.println(boolStr);
		System.out.println(boolStr.toUpperCase());
	}
}
