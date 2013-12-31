package codes.chapter14;
/**
 * @Deprecated:
 * 	1.用于表示某个程序元素（类、方法等）已过时，当其它程序使用已过时的类、方法时，编译器将会给出警告。
 * @author pengcx
 *
 */
public class DeprecatedTest {

	public static void main(String[] args) {
		//下面使用info方法时将会被编译器警告
		new Apple1().info();
	}
}

class Apple1{
	//定义info方法已过时
	@Deprecated
	public void info(){
		System.out.println("Apple的info方法");
	}
}
