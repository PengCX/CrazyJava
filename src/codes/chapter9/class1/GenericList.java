package codes.chapter9.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 9.1.3使用泛型
 * @author pengcx
 *
 */
public class GenericList {
	public static void main(String[] args){
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		strList.add("轻量级Java EE企业应用实战");
		
		//下面代码将引起编译错误
//		strList.add(5);
		for(int i = 0; i < strList.size(); i++){
			//下面无须进行类型转换
			String str = strList.get(i);
			System.out.println(str);
		}
	}
}
