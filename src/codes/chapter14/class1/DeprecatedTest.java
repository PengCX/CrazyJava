package codes.chapter14.class1;

class Apple1{
	//定义info方法已经过时
	@Deprecated
	public void info(){
		System.out.println("Apple的info方法");
	}
}

public class DeprecatedTest {
	public static void main(String[] args) {
		//下面使用info方法时将会被编译器警告
		new Apple1().info();
	}
}
