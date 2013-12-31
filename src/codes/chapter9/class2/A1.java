package codes.chapter9.class2;
/**
 * 9.2.2从泛型类派生子类
 * @author pengcx
 *
 */
public class A1 extends Apple<String>{
	//正确重写父类的方法，返回值
	//与父类Apple<String>的返回值完全相同
	public String getInfo(){
		return "子类" + super.getInfo();
	}
	
	//下面的方法是错误的，重写父类的方法时返回值类型不一致
//	public Object getInfo(){
//		return "子类";
//	}
}

