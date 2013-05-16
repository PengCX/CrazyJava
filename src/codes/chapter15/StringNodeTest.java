package codes.chapter15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
	public static void main(String[] args) throws IOException{
		String src = "����������һ���Ҹ�����\n" + "ι��������������\n" + "�������𣬹�����ʳ���߲�\n"
				+ "����һ�����ӣ��泯�󺣣���ů����\n" + "�������𣬺�ÿһ������ͨ��\n" + "�����������ǵ��Ҹ�\n";
		
		StringReader sr = new StringReader(src);
		char[] buffer = new char[32];
		int hasRead = 0;
		try {
			//����ѭ���ķ�ʽ��ȡ�ַ���
			while ((hasRead = sr.read(buffer)) > 0) {
				System.out.print(new String(buffer, 0, hasRead));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sr.close();
		}
		
		//����StringWriter�ǣ�ʵ������һ��StringBuffer��Ϊ����ڵ�
		//�������ƶ�20����StringBuffer�ĳ�ʼ����
		StringWriter sw = new StringWriter(20);
		//����StringWriter�ķ���ִ�����
		sw.write("��Զ���˴�,\n");
		sw.write("��������ů����,\n");
		sw.write("��ֻ��һֻС��,\n");
		sw.write("һ�������ŵ����»���,\n");
		System.out.println("------������sw���ַ����ӽڵ��������------");
		//ʹ��toString��������StringWriter���ַ����ڵ�����
		System.out.println(sw.toString());
		sw.close();
	}
}
