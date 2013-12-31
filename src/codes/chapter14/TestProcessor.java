package codes.chapter14;

import java.lang.reflect.Method;

public class TestProcessor {
	public static void process(String clazz) throws ClassNotFoundException {
		int passed = 0;
		int failed = 0;

		// 遍历obj对象的所有方法
		for (Method m : Class.forName(clazz).getMethods()) {
			// 如果包含@Testable标记注释
			if (m.isAnnotationPresent(Testable.class)) {
				try {
					// 调用m方法
					m.invoke(null);
					// passed加1
					passed++;
				} catch (Exception e) {
					System.out.println("方法" + m + "运行失败，异常：" + e.getCause());
				}
			}
		}

		System.out.println("共运行了：" + (passed + failed) + "个方法，其中失败了：" + failed
				+ "个，成功了：" + passed + "个");
	}
}
