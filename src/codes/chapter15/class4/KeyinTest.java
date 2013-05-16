package codes.chapter15.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br= null;
		

		try {
			//��System.in����ת����Reader����
			InputStreamReader reader = new InputStreamReader(System.in);
			//����ͨ��Reader��װ��BufferedReader
			br = new BufferedReader(reader);
			
			String buffer = null;
			//����ѭ���ķ�ʽһ��һ�еĶ�ȡ
			while ((buffer = br.readLine()) != null) {
				//����Ƕ�ȡ�ַ���Ϊ��exit���������˳�
				if (buffer.equals("exit")) {
					System.exit(1);
				}
				//��ӡ��ȡ������
				System.out.println("�����������" + buffer);
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
