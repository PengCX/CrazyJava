package codes.chapter7.class8;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/**
 * Collections设置不可变集合
 * @author Administrator
 *
 */
public class TestUnmodifiable {
	public static void main(String[] args) {
		//创建一个空的、不可改变的List对象
		List unmodifiableList = Collections.emptyList();
		
		//java.lang.UnsupportedOperationException
		//unmodifiableList.add(1);
		System.out.println(unmodifiableList);
		
		//创建一个只有一个元素，且不可改变的Set对象
		Set unmodifiableSet = Collections.singleton("Struts2权威指南");
		//java.lang.UnsupportedOperationException
		//unmodifiableSet.add("aa");
		System.out.println(unmodifiableSet);
		
		//创建一个普通Map对象
		Map scores = new HashMap();
		scores.put("语文", 90);
		scores.put("Java", 80);
		//返回普通Map对象对象的不可变版本
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//下面任意一行代码印花UnsupportedOperationException异常
		unmodifiableList.add("测试元素");
		unmodifiableSet.add("测试元素");
		unmodifiableMap.put("语文",30);
	}
}
