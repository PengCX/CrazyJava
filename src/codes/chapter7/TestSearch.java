package codes.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections��������ҡ��滻����
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

		// ������Ԫ��
		System.out.println(Collections.max(nums));
		//�����СԪ��
		System.out.println(Collections.min(nums));
		
		//��nums�е�0�滻��1
		Collections.replaceAll(nums, 0, 1);
		System.out.println(nums);
		
		//�ж�-5��List�����г��ֵĴ���
		System.out.println(Collections.frequency(nums, -5));
		
		//��nums���Ͻ�������
		Collections.sort(nums);
		System.out.println(nums);
		
		//ֻ��������List���ϲſ��ö��ֲ��ң����3
		System.out.println(Collections.binarySearch(nums, 3));
	}
}
