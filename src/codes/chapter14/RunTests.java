package codes.chapter14;
/**
 * JDK��ע���൱�򵥣�����ΪԴ���������һЩ�����ǣ���Щ�����ǿ���ͨ���������ȡ
 * һ�����������Щ�����Ǻ󣬳���������Ӧ�Ĵ���
 * @author pengcx
 *
 */
public class RunTests {
	public static void main(String[] args) {
		//����MyTest��
		//FIXME ��ClassNotFoundExcepiton�쳣��û���ҳ�ԭ��
		try {
			TestProcessor.process("MyTest");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
