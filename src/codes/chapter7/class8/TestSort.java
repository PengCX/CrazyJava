package codes.chapter7.class8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Collections���������
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

		// ��List����Ԫ�ش���ת
		Collections.reverse(nums);
		System.out.println(nums);

		// ��List����Ԫ�ذ�����Ȼ˳������
		Collections.sort(nums);
		System.out.println(nums);

		// ��List����Ԫ�ذ����˳������,ÿ�������˳�򲻹̶�
		Collections.shuffle(nums);
		System.out.println(nums);

	}
}
