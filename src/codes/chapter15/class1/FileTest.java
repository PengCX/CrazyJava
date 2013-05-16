package codes.chapter15.class1;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{
		//�Ե�ǰ·��������һ��File����
		File file = new File(".");
		//ֱ�ӻ�ȡ�ļ��������һ��
		System.out.println(file.getName());
		//��ȡ���·���ĸ�·�����ܳ�������������null
		System.out.println(file.getParent());
		//��ȡ����·��
		System.out.println(file.getAbsoluteFile());
		//��ȡ��һ��·��
		System.out.println(file.getAbsoluteFile().getParent());
		
		//�ڵ�ǰ·���´���һ����ʱ�ļ�
		File tmpFile = File.createTempFile("aaa", ".txt", file);
		//�ƶ���JVM�˳���ʱɾ�����ļ�
		tmpFile.deleteOnExit();
		
		//��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("newFile�����Ƿ���ڣ�" + newFile.exists());
		//���ƶ�newFile����������һ���ļ�
		newFile.createNewFile();
		//��newFile���󴴽�һ��Ŀ¼����ΪnewFile�Ѿ�����
		//��������ķ�������false�����޷�������Ŀ¼
		newFile.mkdir();
		
		//ʹ��list�������г���ǰ·���µ������ļ���·��
		String[] fileList = file.list();
		System.out.println("=====��ǰ·�������е��ļ���·������=====");
		for (String fileName : fileList) {
			System.out.println(fileName);
		}
		
		//listRoots��̬�����г����д��̸�·��
		File[] roots = File.listRoots();
		System.out.println("=====ϵͳ���и�·������=====");
		for (File root : roots) {
			System.out.println(root);
		}
	}
}
