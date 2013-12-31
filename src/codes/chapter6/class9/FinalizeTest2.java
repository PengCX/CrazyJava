package codes.chapter6.class9;

public class FinalizeTest2 {
	private static FinalizeTest2 ft = null;
	private void info(){
		System.out.println("测试资源清理的finalize方法");
	}
	
	public static void main(String[] args)throws Exception{
		//创建TestFinalize对象立即进入可恢复状态
		new FinalizeTest2();
		//通知系统进行资源回收
		System.gc();
		//强制垃圾回收机制调用可恢复对象的finalize方法
		Runtime.getRuntime().runFinalization();
		ft.info();
	}
	
	public void finalize(){
		//让ft引用到试图回收的可恢复对象，即可恢复对象重新变成可达状态
		ft = this;
	}
}
