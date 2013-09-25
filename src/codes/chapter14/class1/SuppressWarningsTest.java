package codes.chapter14.class1;

import java.util.ArrayList;
import java.util.List;

//关闭整个类里的编译器警告
@SuppressWarnings(value="unchecked")
public class SuppressWarningsTest {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
	}
}
