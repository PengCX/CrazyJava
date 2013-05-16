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
			// 创建字节输入流
			fis = new FileInputStream(
					"D:\\workspace4.2\\crazyjavahandout\\src\\codes\\chapter15\\class1\\FileOutputStreamTest.java");
			//创建输出流
			fos = new FileOutputStream("newFile.txt");
			
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			//循环从输入流中读取数据
			while ((hasRead = fis.read(bbuf)) > 0) {
				//每读取一次，即吸入文件输出流，读了多少，就写多少
				fos.write(bbuf, 0, hasRead);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//使用finally块来关闭文件输入流
			if (fis != null) {
				fis.close();
			}
			//使用finally块来关闭输出流
			if (fos != null) {
				fos.close();
			}
		}
	}
}
