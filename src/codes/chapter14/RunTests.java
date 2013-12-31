package codes.chapter14;
/**
 * JDK的注释相当简单，我们为源代码中添加一些特殊标记，这些特殊标记可以通过发发射获取
 * 一旦程序访问这些特殊标记后，程序做出相应的处理。
 * @author pengcx
 *
 */
public class RunTests {
	public static void main(String[] args) {
		//处理MyTest类
		//FIXME 报ClassNotFoundExcepiton异常，没有找出原因
		try {
			TestProcessor.process("MyTest");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
