package codes.chapter15.class3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException{
		FileReader fr = null;

		try {
			// �����ַ�������
			fr = new FileReader(
					"D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\FileReaderTest.java");
			// ��������Ϊ32�ġ���Ͳ��
			char[] cbuf = new char[32];
			// �û�����ʵ�ʶ�ȡ���ַ���
			int hasRead = 0;
			// ʹ��ѭ�����ظ���ȡˮ������
			while ((hasRead = fr.read(cbuf)) > 0) {
				// ȡ������Ͳ����ˮ�Σ��ֽڣ������ַ�����ת�����ַ������
				System.out.print(new String(cbuf, 0, hasRead));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (fr != null) {
				fr.close();
			}
		}
	}
}
