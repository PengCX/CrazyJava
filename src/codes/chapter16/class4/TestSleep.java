package codes.chapter16.class4;

import java.util.Date;

public class TestSleep {
	public static void main(String[] args) throws Exception {
		for(int i = 0; i < 10; i++){
			System.out.println("当前时间：" + new Date());
			//调用sleep方法让当前线程暂停1s
			Thread.sleep(1000);
		}
	}
}
