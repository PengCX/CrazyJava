package codes.chapter14;

//使用@Inheritable修饰Base类
@Inheritable
class Base{
	
}
//TestInheritable类只是继承了Base类
//并未直接使用@Inheritable Annotation修饰
public class TestInheritable extends Base{
	public static void main(String[] args){
		System.out.println(TestInheritable.class.isAnnotationPresent(Inheritable.class));
	}
}


