package codes.chapter6.class1;

/**
 * 6.1Java7增强的包装类型
 * 
 * @author pengcx
 * 
 */
public class WrapperClassCompare {
	public static void main(String[] args) {
		// 直接取出包装类型实例所包装的值进行比较
		Integer a = new Integer(6);
		System.out.println("6的包装类型是否大于5.0：" + (a > 5.0));

		// 两个包装类型的值进行比较(创建新的对象)
		System.out.println("比较2个包装类型的实例是否相等："
				+ (new Integer(2) == new Integer(2)));
		
		//通过自动装箱，允许把基本类型值赋值给包装类型实例(获取常量池缓冲)
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("两个2自动装箱后是否相等：" + (ina == inb));
		Integer big1 = 128;
		Integer big2 = 128;
		System.out.println("两个128自动装箱后是否相等：" + (big1 == big2));
	
//		System.out.println(Boolean.compare(true,false));
//		System.out.println(Boolean.compare(true,ture));
//		System.out.println(Boolean.compare(false,true));
	}
}
