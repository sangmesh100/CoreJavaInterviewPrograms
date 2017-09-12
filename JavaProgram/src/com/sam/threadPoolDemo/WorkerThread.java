package com.sam.threadPoolDemo;

public class WorkerThread implements Runnable
{
	public String msg;

	public WorkerThread(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" message"+ msg);
		processMsg();
		System.out.println(Thread.currentThread().getName()+" end");
	}

	private void processMsg() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
