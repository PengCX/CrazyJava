package codes.chapter9.class2;
/**
 * 9.2.2从泛型类派生子类
 * @author pengcx
 *
 */
public class A2 extends Apple{
	//重写父类方法
	public String getInfo(){
		//super.getInfo()方法返回值是Object类型
		//所以加toString()才返回String类型
		return super.getInfo().toString();
	}
}
