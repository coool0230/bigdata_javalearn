/** 
* @author:huyn 
* @version 创建时间：2019年3月1日 上午10:19:24 
* @Des:使用 getThreadId() 方法获取线程id
*/ 

package com.meego.cainiao.thread;
public class GetThreadIdDemo extends Object implements Runnable {
	private ThreadID  var;
	public GetThreadIdDemo(ThreadID v) {
		    this.var = v;
		  }
	public static void main(String[] args) {
		ThreadID tid = new ThreadID();
		GetThreadIdDemo shared = new GetThreadIdDemo(tid);
	 
	    try {
	      Thread threadA = new Thread(shared, "threadA");
	      threadA.start();
	 
	      Thread.sleep(500);
	 
	      Thread threadB = new Thread(shared, "threadB");
	      threadB.start();
	 
	      Thread.sleep(500);
	 
	      Thread threadC = new Thread(shared, "threadC");
	      threadC.start();
	    } catch (InterruptedException x) {
	    }
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
	    try {
	    	print("var getThreadID =" + var.getThreadID());
			Thread.sleep(2000);
			print("var getThreadID =" + var.getThreadID());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	    
	}
	private static void print(String msg) {
	    String name = Thread.currentThread().getName();
	    System.out.println(name + ": " + msg);
	}

}


class ThreadID extends ThreadLocal{
	private int nextID;
	public ThreadID() {
	    nextID = 10001;
	  }
	private synchronized Integer getNewID() {
	    Integer id = new Integer(nextID);
	    nextID++;
	    return id;
	  }
	protected Object initialValue() {
		print("in initialValue()");
		return getNewID();
		  }
	public int getThreadID() {
		Integer id = (Integer) get();
		return id.intValue();
		  }
	private static void print(String msg) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}
}
