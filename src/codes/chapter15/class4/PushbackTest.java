package codes.chapter15.class4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackTest {
	public static void main(String[] args) {
		PushbackReader pr = null;

		try {
			// 创建一个PushbakReader对象，制定推回缓冲区的长度64
			pr = new PushbackReader(new FileReader("D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\PushbackTest.java"),64);

			char[] buf = new char[32];
			// 用于保存上次读取的字符串的内容
			String lastContent = "";
			int hasRead = 0;
			// 循环读取文件内容
			while ((hasRead = pr.read(buf)) > 0) {
				// 将读取的内容转换成字符串
				String content = new String(buf, 0, hasRead);
				int targetIndex = 0;
				// 将上次读取的字符串和本次读取的字符串拼接起来，查看是否包含目标字符串
				// 如果包含目标字符串
				if ((targetIndex = (lastContent + content)
						.indexOf("new PushbackReader")) > 0) {
					// 将本次内容和上次内容一起推回缓冲区
					pr.unread((lastContent + content).toCharArray());
					// 再次读取制定长度的内容（就是目标字符串之前的内容）
					pr.read(buf, 0, targetIndex);
					// 打印读取的内容
					System.out.print(new String(buf, 0, targetIndex));
					System.exit(0);
				} else {
					// 打印上次读取的内容
					System.out.print(lastContent);
					// 将本次内容设置为上次读取的内容
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
