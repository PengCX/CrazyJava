package codes.chapter6.class9;

import java.lang.ref.WeakReference;

public class ReferenceTest {
	public static void main(String[] args){
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�������ã��ô����������õ������Java���塱�ַ���
		WeakReference wr = new WeakReference(str);
		//�ж�str���ú͡����Java���塱�ַ���
		str = null;
		//ȡ�����������õĶ���
		System.out.println(wr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());
	}
}
