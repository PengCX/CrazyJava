package codes.chapter14;

//ʹ��@Inheritable����Base��
@Inheritable
class Base{
	
}
//TestInheritable��ֻ�Ǽ̳���Base��
//��δֱ��ʹ��@Inheritable Annotation����
public class TestInheritable extends Base{
	public static void main(String[] args){
		System.out.println(TestInheritable.class.isAnnotationPresent(Inheritable.class));
	}
}


