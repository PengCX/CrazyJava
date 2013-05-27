package codes.chapter16.class6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	//��ʾ����Lock����
	private final Lock lock = new ReentrantLock();
	//���ָ��Lock�����Ӧ����������
	private final Condition cond = lock.newCondition();
	
	private String accountNo;
	private double balance;
	
	//��ʶ�˻����Ƿ��Ѿ����ڴ�����
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
		//����
		lock.lock();
		
		
		try {
			if(!flag){
				cond.await();
			}else{
				//ִ��ȡǮ����
				System.out.println(Thread.currentThread().getName() + "ȡǮ��" + drawAmount);
				balance -= drawAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʶ�Ƿ�ɹ�����������Ϊfalse
				flag = false;
				//���Ѹ�Lock�����Ӧ�������߳�
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
				//ִ�д�����
				System.out.println(Thread.currentThread().getName() + "��" + depositAmount);
				balance += depositAmount;
				System.out.println("�˻����Ϊ��" + balance);
				//����ʶ�Ƿ�ɹ�����������Ϊtrue
				flag = true;
				//���Ѹ�Lock�����Ӧ�������߳�
				cond.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
