package codes.chapter16.class4;

import java.util.Date;

public class TestSleep {
	public static void main(String[] args) throws Exception {
		for(int i = 0; i < 10; i++){
			System.out.println("��ǰʱ�䣺" + new Date());
			//����sleep�����õ�ǰ�߳���ͣ1s
			Thread.sleep(1000);
		}
	}
}
