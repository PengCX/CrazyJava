package codes.chapter15.class3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException{
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("poem.txt");
			//\r\n��windowƽ̨�Ļ��У�Unix/Linux/BSD��ƽ̨Ϊ\n����
			fw.write("��ɪ-������\r\n");
			fw.write("��ɪ�޶���ʮ�ң�һ��һע˼���ꡣ\r\n");
			fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
			fw.write("�׺����������ᣬ������ů�����̡�\r\n");
			fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ ���Ȼ��\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//ʹ��finally�����ر��ļ������
			if (fw != null) {
				fw.close();
			}
		}
		
	}
}
