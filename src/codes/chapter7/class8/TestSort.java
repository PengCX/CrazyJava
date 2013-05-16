package codes.chapter7.class8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Collections类的排序功能
 * @author Administrator
 *
 */
public class TestSort {
	public static void main(String[] args) {
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);

		System.out.println(nums);

		// 将List集合元素次序反转
		Collections.reverse(nums);
		System.out.println(nums);

		// 将List集合元素按照自然顺序排列
		Collections.sort(nums);
		System.out.println(nums);

		// 将List集合元素按随机顺序排列,每次输出的顺序不固定
		Collections.shuffle(nums);
		System.out.println(nums);

	}
}
