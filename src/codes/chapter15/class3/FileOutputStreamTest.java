package codes.chapter15.class3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// �����ֽ�������
			fis = new FileInputStream(
					"D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\FileOutputStreamTest.java");
			//���������
			fos = new FileOutputStream("newFile.txt");
			
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			//ѭ�����������ж�ȡ����
			while ((hasRead = fis.read(bbuf)) > 0) {
				//ÿ��ȡһ�Σ��������ļ�����������˶��٣���д����
				fos.write(bbuf, 0, hasRead);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//ʹ��finally�����ر��ļ�������
			if (fis != null) {
				fis.close();
			}
			//ʹ��finally�����ر������
			if (fos != null) {
				fos.close();
			}
		}
	}
}
