package codes.chapter14;

public class MyTest {
	@Testable
	public static void m1(){
		
	}
	
	public static void m2(){
		
	}
	
	//使用@Testable标记注释制定该方法是可测试的
	@Testable
	public static void m3(){
		throw new RuntimeException("Boom");
	}
	
	public static void m4(){
		
	}
	
	//使用@Testable标记注释制定该方法是可测试的
	@Testable
	public static void m5(){
		
	}
	
	public static void m6(){
		
	}

	//使用@Testable标记注释制定该方法是可测试的
	@Testable
	public static void m7(){
		throw new RuntimeException("Crash");
	}
	
	public static void m8(){
		
	}
}
