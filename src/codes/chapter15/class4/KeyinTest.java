package codes.chapter15.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br= null;
		

		try {
			//将System.in对象转换成Reader对象
			InputStreamReader reader = new InputStreamReader(System.in);
			//将普通的Reader包装成BufferedReader
			br = new BufferedReader(reader);
			
			String buffer = null;
			//采用循环的方式一行一行的读取
			while ((buffer = br.readLine()) != null) {
				//如果是读取字符串为”exit“，程序退出
				if (buffer.equals("exit")) {
					System.exit(1);
				}
				//打印读取的内容
				System.out.println("输出的内容是" + buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}

	}
}
