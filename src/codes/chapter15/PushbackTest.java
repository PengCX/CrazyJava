package codes.chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackTest {
	public static void main(String[] args) {
		PushbackReader pr = null;

		try {
			// ����һ��PushbakReader�����ƶ��ƻػ������ĳ���64
			pr = new PushbackReader(new FileReader("D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\PushbackTest.java"),64);

			char[] buf = new char[32];
			// ���ڱ����ϴζ�ȡ���ַ���������
			String lastContent = "";
			int hasRead = 0;
			// ѭ����ȡ�ļ�����
			while ((hasRead = pr.read(buf)) > 0) {
				// ����ȡ������ת�����ַ���
				String content = new String(buf, 0, hasRead);
				int targetIndex = 0;
				// ���ϴζ�ȡ���ַ����ͱ��ζ�ȡ���ַ���ƴ���������鿴�Ƿ����Ŀ���ַ���
				// �������Ŀ���ַ���
				if ((targetIndex = (lastContent + content)
						.indexOf("new PushbackReader")) > 0) {
					// ���������ݺ��ϴ�����һ���ƻػ�����
					pr.unread((lastContent + content).toCharArray());
					// �ٴζ�ȡ�ƶ����ȵ����ݣ�����Ŀ���ַ���֮ǰ�����ݣ�
					pr.read(buf, 0, targetIndex);
					// ��ӡ��ȡ������
					System.out.print(new String(buf, 0, targetIndex));
					System.exit(0);
				} else {
					// ��ӡ�ϴζ�ȡ������
					System.out.print(lastContent);
					// ��������������Ϊ�ϴζ�ȡ������
					lastContent = content;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pr != null) {
					pr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}