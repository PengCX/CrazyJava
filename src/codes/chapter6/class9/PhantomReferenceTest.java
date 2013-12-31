package codes.chapter6.class9;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
	public static void main(String[] args)throws Exception{
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
		//����һ�������ã��ô����������õ������Java���塰�ַ���
		PhantomReference pr = new PhantomReference(str, rq);
		//�ж�str���ú͡����Java���塱�ַ���֮�������
		str = null;
		//ȡ�������������õĶ���
		//������ͨ�������÷��ʱ����õĶ������Դ˴����null
		System.out.println(pr.get());
		
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�������պ������ý����������ö�����
		//ȡ�����ö��������Ƚ�����е�������pr���бȽ�
		System.out.println(rq.poll() == pr);
	}
}
