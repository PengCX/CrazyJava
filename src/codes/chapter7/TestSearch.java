package codes.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类查找、替换操作
 * 
 * @author Administrator
 * 
 */
public class TestSearch {
	public static void main(String[] args) {
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(0);
		nums.add(3);
		nums.add(0);

		System.out.println(nums);

		// 输出最大元素
		System.out.println(Collections.max(nums));
		//输出最小元素
		System.out.println(Collections.min(nums));
		
		//将nums中的0替换成1
		Collections.replaceAll(nums, 0, 1);
		System.out.println(nums);
		
		//判断-5在List集合中出现的次数
		System.out.println(Collections.frequency(nums, -5));
		
		//对nums集合进行排序
		Collections.sort(nums);
		System.out.println(nums);
		
		//只有排序后的List集合才可用二分查找，输出3
		System.out.println(Collections.binarySearch(nums, 3));
	}
}
