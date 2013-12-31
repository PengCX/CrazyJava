package codes.chapter6.class9;

public class StatusTranfer {
	public static void test() {
		// 定义了一个变量a,指向“轻量级Java EE企业应用实战“字符串，该字符串处于可达状态
		String a = new String("轻量级Java EE企业应实战");
		// 代码定义了”疯狂Java讲义“字符串对象，并让a变量指向该对象，此时”轻量级Java
		// EE企业应用实战“字符串处于恢复状态，”疯狂Java讲义“字符串处于可达状态
		a = new String("疯狂Java讲义");
	}

	public static void main(String[] args) {
		test();
	}
}
