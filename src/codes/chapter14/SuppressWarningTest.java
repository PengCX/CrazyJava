package codes.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * @SuppressWarnings:
 * 	1.指示被Annotation表示的程序元素（以及该程序中的所有子元素）取消制定的编译器警告。
 * 	2.@suppresswarnings会一直作用于该程序的所有子元素，如@suppresswarnings表示一个类来取消某
 * 	  个编译器警告，同时又标识该类的某个方法取消另一个编译器警告，那么将在这个方法中同时取消显示这两个
 *    警告。
 *    
 * @author pengcx
 *
 */
@SuppressWarnings(value="unchecked")
public class SuppressWarningTest {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList();
	}

}
