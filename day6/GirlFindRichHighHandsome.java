/**
* Filename : GirlFindRichHighHandsome.java
* Author : huyn
* Creation time : 下午10:37:17 - 2018年12月26日
* Description :
*/
package com.day6.com;
public class GirlFindRichHighHandsome {
	public static void main(String[] args){
		Obama obama = new Obama();
		obama.handsome();
		obama.high();
		obama.veryRich();
		
		Girl small7 = new Girl();
		small7.findBoyFriend(obama);
		
		small7.findBoyFriend(new HVH(){
			public void high(){
				System.out.println("wo 很高");
			}
			public void veryRich(){
				System.out.println("wo 很fu");
			}
			public void handsome(){
				System.out.println("wo 很shuai ");
			}
		});
	}
}


interface High{
	public void high();
}

interface VeryRich{
	public void veryRich();
}

interface Handsome{
	public void handsome();
}

interface HVH extends High,VeryRich,Handsome{
	
}

class Girl{
	public void findBoyFriend(HVH hvh){
		System.out.println("找到一个高富帅");
	}
}

class Obama implements HVH{
	public void high(){
		System.out.println("奥马巴很高");
	}
	public void veryRich(){
		System.out.println("奥马巴很富");
	}
	public void handsome(){
		System.out.println("奥马巴很帅");
	}
}