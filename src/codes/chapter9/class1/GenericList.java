package codes.chapter9.class1;

import java.util.ArrayList;
import java.util.List;

/**
 * 9.1.3ʹ�÷���
 * @author pengcx
 *
 */
public class GenericList {
	public static void main(String[] args){
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<String>();
		strList.add("���Java����");
		strList.add("���Android����");
		strList.add("������Java EE��ҵӦ��ʵս");
		
		//������뽫����������
//		strList.add(5);
		for(int i = 0; i < strList.size(); i++){
			//���������������ת��
			String str = strList.get(i);
			System.out.println(str);
		}
	}
}
