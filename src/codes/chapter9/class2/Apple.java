package codes.chapter9.class2;
/**
 * 9.2.1定义泛型接口、类
 * @author pengcx
 *
 */
//定义Apple类时使用了泛型声明
public class Apple<T> {
	//定义T类型参数定义实例变量
	private T info;
	
	public Apple(){
		
	}
	
	//下面的方法中使用T类型参数来定义构造器
	public Apple(T info){
		this.info = info;
	}
	
	public void setInfo(T info){
		this.info = info;
	}
	
	public T getInfo(){
		return this.info;
	}
	
	public static void main(String[] args){
		//因为传递给T形参的是String实际类型
		//所以构造器的参数只能是String
		Apple<String> a1 = new Apple<String>("苹果");
		System.out.println(a1.getInfo());
		
		//因为传递给T形参的是Double实际类型
		//所有构造器的参数只能是Integer
		Apple<Double> a2 = new Apple<Double>(5.67);
		System.out.println(a2.getInfo());
	}
}
