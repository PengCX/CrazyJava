package codes.chapter15.class4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
	public static void main(String[] args) {
		PrintStream ps = null;
		
		try {
			//����һ���ڵ��������FileOutputStream
			FileOutputStream fos = new FileOutputStream("test.txt");
			//��PrintStream����װFileOutputStream�����
			ps = new PrintStream(fos);
			//ʹ��PrintStreamִ�����
			ps.println("��ͨ�ַ���");
			//ֱ�����PrintStream�������
			ps.println(new PrintStreamTest());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			//������ʹ�ô���������װ�ײ�ڵ���֮�󣬹ر�����/�������Դ��ʱ��ֻҪ�ر����ϲ�Ĵ��������ɡ�
			ps.close();
		}
		
	}
}
