/** 
* @author:huyn 
* @version 创建时间：2019年2月26日 下午2:25:09 
* @Des: Finally 关键一般与try一起使用，在程序进入try块之后，无论程序是因为异常而中止或其它方式返回终止的，finally块的内容一定会被执行 。
*/ 

package com.meego.cainiao.exceptionhandle;
public class ExceptionFinallyDemo {

	public static void main(String[] args) {
		new ExceptionFinallyDemo().doTheWork();
	}

	public void doTheWork() {
		Object o = null;
		for(int i = 0;i < 5;i ++) {
			try {
				o = makeObj(i);
			}
			catch(IllegalArgumentException e) {
				System.out.println("Error: ("+ e.getMessage()+").");
				return;
			}
			finally {
				System.err.println("都已执行完毕");
				if(o == null) {
					System.exit(0);
				}
				
			}
			System.out.println(o); 
		}
	}
	
	public Object makeObj(int type) throws IllegalArgumentException {
		if(type == 4) {
			throw new IllegalArgumentException("不是指定的类型： " + type);
		}
		return new Object();
	}

}

