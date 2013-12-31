package codes.chapter14;

import java.lang.reflect.Method;

public class TestProcessor {
	public static void process(String clazz) throws ClassNotFoundException {
		int passed = 0;
		int failed = 0;

		// ����obj��������з���
		for (Method m : Class.forName(clazz).getMethods()) {
			// �������@Testable���ע��
			if (m.isAnnotationPresent(Testable.class)) {
				try {
					// ����m����
					m.invoke(null);
					// passed��1
					passed++;
				} catch (Exception e) {
					System.out.println("����" + m + "����ʧ�ܣ��쳣��" + e.getCause());
				}
			}
		}

		System.out.println("�������ˣ�" + (passed + failed) + "������������ʧ���ˣ�" + failed
				+ "�����ɹ��ˣ�" + passed + "��");
	}
}
