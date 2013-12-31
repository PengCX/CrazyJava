package codes.chapter14;
/**
 *  @Overide:
 *  	1.指定方法覆载的，它可以强制一个子类必须需要覆盖父类的方法
 *  	2.只能用于作用于方法，不能用于作用于其它程序元素
 * @author pengcx
 *
 */
public class Fruit {
	public void foo(){
		System.out.println("水果的info方法");
	}

}

class Apple extends Fruit {
	//使用@Override制定下面方法必须重写父类方法
	@Override
	public void foo(){
		System.out.println("苹果重写水果的info的方法...");
	}
}
