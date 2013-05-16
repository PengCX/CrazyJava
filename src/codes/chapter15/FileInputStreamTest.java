package codes.chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException {
		// �����ֽ�������
		FileInputStream fis = new FileInputStream(
				"D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\FileInputStreamTest.java");
		// ����һ������Ϊ1024�ġ���Ͳ��
		byte[] bbuf = new byte[1024];
		// �û�����ʵ�ʶ�ȡ���ֽ���
		int hasRead = 0;
		// ʹ��ѭ�����ظ���ȡˮ������
		while ((hasRead = fis.read(bbuf)) > 0) {
			// ȡ������Ͳ���е�ˮ�Σ��ֽڣ������ֽ�����ת�����ַ������룡
			System.out.print(new String(bbuf, 0, hasRead));
		}

		// �ر�������������finally�������ȫ
		fis.close();
	}
}
