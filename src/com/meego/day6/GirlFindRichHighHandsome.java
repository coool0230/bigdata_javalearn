/**
* Filename : GirlFindRichHighHandsome.java
* Author : huyn
* Creation time : ����10:37:17 - 2018��12��26��
* Description :
*/
package com.meego.day6;
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
				System.out.println("wo �ܸ�");
			}
			public void veryRich(){
				System.out.println("wo ��fu");
			}
			public void handsome(){
				System.out.println("wo ��shuai ");
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
		System.out.println("�ҵ�һ���߸�˧");
	}
}

class Obama implements HVH{
	public void high(){
		System.out.println("����ͺܸ�");
	}
	public void veryRich(){
		System.out.println("����ͺܸ�");
	}
	public void handsome(){
		System.out.println("����ͺ�˧");
	}
}