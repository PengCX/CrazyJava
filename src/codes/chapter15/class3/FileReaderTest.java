package codes.chapter15.class3;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) throws IOException{
		FileReader fr = null;

		try {
			// 创建字符输入流
			fr = new FileReader(
					"D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\FileReaderTest.java");
			// 创建长度为32的”竹筒“
			char[] cbuf = new char[32];
			// 用户保存实际读取的字符数
			int hasRead = 0;
			// 使用循环来重复”取水“过程
			while ((hasRead = fr.read(cbuf)) > 0) {
				// 取出”竹筒“中水滴（字节），将字符数组转换成字符串输出
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
