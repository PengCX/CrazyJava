package codes.chapter6.class1;
/**
 * 6.1Java7增强的包装类型：自动装箱和自动拆箱
 * @author pengcx
 *
 */
public class AutoBoxingUnboxing {
	public static void main(String[] args){
		//自动装箱：直接把一个基本类型赋值给Integer对象
		Integer inObj = 5;
		
		//自动装箱：直接把一个boolean类型变量赋值给一个Object类型变量
		Object boolObj = true;
		
		//自动拆箱：直接把一个Integer对象赋值int类型变量
		int it = inObj;
		
		if(boolObj instanceof Boolean){
			//先把Object对象强制类型转换成Boolean类型，在赋值给boolean变量
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	}
}
