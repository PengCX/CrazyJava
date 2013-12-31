package codes.chapter9.class4;

import java.util.ArrayList;
import java.util.Collection;

import com.sun.org.apache.xpath.internal.operations.Number;
import com.sun.tools.javac.code.Type.ForAll;

/**
 * 9.4.1泛型方法
 * @author pengcx
 *
 */
public class GenericMethodTest {
	//声明一个泛型方法，该泛型方法中带一个T类型参数
	static<T> void fromArrayToCollection(T[]a,Collection<T> c){
		for(T o : a){
			c.add(o);
		}
	}
	
	public static void main(String[] args){
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		//下面代码中T代表Object类型
		fromArrayToCollection(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<String>();
		//下面代码中T代表String类型
		fromArrayToCollection(sa, cs);
		//下面代码中T代表Object类型
		fromArrayToCollection(sa, co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<Number>();
		//下面代码中T代表45类型
//		fromArrayToCollection(ia, cn);
		//下面代码中T代表
	}
}
