package codes.chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties基本演示：
 * @author pengcx
 *
 */
public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		//向Properties中添加属性
		props.setProperty("username", "yeeku");
		props.setProperty("password", "123456");
		//将Properties中的key-value对保存到a.ini文件中
		props.store(new FileOutputStream("a.ini"),"comment line");
		
		//新建一个Properties对象
		Properties props2 = new Properties();
		//向Properties中添加属性
		props2.setProperty("gender", "male");
		//将a.ini文件中的key-value对追加到props2中
		props2.load(new FileInputStream("a.ini"));
		System.out.println(props2);
	}

}
