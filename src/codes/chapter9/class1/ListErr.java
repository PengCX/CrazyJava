package codes.chapter9.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 9.1.1����ʱ����������쳣
 * @author pengcx
 *
 */
public class ListErr {
	public static void main(String[] args){
		//����һ��ָ�򱣴��ַ�����List����
		List strList = new ArrayList();
		strList.add("���Java����");
		strList.add("���Ajax����");
		strList.add("������Java EE��ҵӦ��ʵս");
		//����С�ġ���һ��Integer���󡰶������˼���
		strList.add(5);
		
		for(int i = 0; i < strList.size(); i++){
			//��ΪList��ȡ����ȫ����Object�����Ա������ǿ������ת��
			//���һ��Ԫ�ؽ�����ClassCastException�쳣
			String str=  (String)strList.get(i);
		}
	}
}
