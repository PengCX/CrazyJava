package codes.chapter16.class6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	//显示定义Lock对象
	private final Lock lock = new ReentrantLock();
	//获得指定Lock对象对应的条件变量
	private final Condition cond = lock.newCondition();
	
	private String accountNo;
	private double balance;
	
	//标识账户中是否已经存在存款旗标
	private boolean flag = false;
	
	public Account(){
		
	}
	
	public Account(String accountNo,double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void draw(double drawAmount){
		//加锁
		lock.lock();
		
		
		try {
			if(!flag){
				cond.await();
			}else{
				//执行取钱操作
				System.out.println(Thread.currentThread().getName() + "取钱：" + drawAmount);
				balance -= drawAmount;
				System.out.println("账户余额为：" + balance);
				//将标识是否成功存入存款的旗标为false
				flag = false;
				//唤醒该Lock对象对应的其它线程
				cond.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void deposit(double depositAmount){
		lock.lock();
		
		try {
			if(flag){
				cond.await();
			}else{
				//执行存款操作
				System.out.println(Thread.currentThread().getName() + "存款：" + depositAmount);
				balance += depositAmount;
				System.out.println("账户余额为：" + balance);
				//将标识是否成功存入存款的旗标为true
				flag = true;
				//唤醒该Lock对象对应的其他线程
				cond.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
