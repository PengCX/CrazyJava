package codes.chapter9.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 9.1.1编译时不检查类型异常
 * @author pengcx
 *
 */
public class ListErr {
	public static void main(String[] args){
		//创建一个指向保存字符串的List集合
		List strList = new ArrayList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Ajax讲义");
		strList.add("轻量级Java EE企业应用实战");
		//“不小心”把一个Integer对象“丢进”了集合
		strList.add(5);
		
		for(int i = 0; i < strList.size(); i++){
			//因为List里取出的全部是Object，所以必须进行强制类型转换
			//最后一个元素将出现ClassCastException异常
			String str=  (String)strList.get(i);
		}
	}
}
