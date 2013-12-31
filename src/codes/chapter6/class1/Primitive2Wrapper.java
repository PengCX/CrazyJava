package codes.chapter6.class1;
/**
 * 6.1Java7增强的包装类：八大包装类型
 * @author pengcx
 *
 */
public class Primitive2Wrapper {
	public static void main(String[] args){
		boolean b1 = true;
		//通过构造器把b1基本类型变量包装成包装类对象
		Boolean blobj = new Boolean(b1);
		
		int it = 5;
		//通过构造器把it基本类型变量包装成包装类对象
		Integer itObj = new Integer(it);
		
		//把一个字符串转换成Float对象
		Float f1 = new Float("4.56");
		//把一个字符串转换成Boolean对象
		Boolean bObj = new Boolean("false");
		
		//下面的程序运行时将出现java.lang.NumberFormatException异常
		Long lObj = new Long("ddd");
	}
}
