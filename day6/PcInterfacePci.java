/**
* Filename : PcInterfacePci.java
* Author : huyn
* Creation time : 下午10:25:35 - 2018年12月26日
* Description :
*/
package com.day6.com;
public class PcInterfacePci {
	public static void main(String[] args){
		Computer1 pc = new Computer1();
		VideoCard videocard = new VideoCard();
		videocard.insertable();
		pc.insertPci(videocard);
		SoundCard soundcard = new SoundCard();
		soundcard.insertable();
		pc.insertPci(soundcard);
		VoiceCard voicecard = new VoiceCard();
		voicecard.insertable();
		pc.insertPci(voicecard);

		
		pc.insertPci(new VideoCard(){});
		pc.insertPci(new SoundCard(){});
		pc.insertPci(new VoiceCard(){});
		
	}
}

class Computer1{
	public void insertPci(Insertable i){
		System.out.println("插入Pci插槽了");
	}
}


interface Insertable{
	public void insertable();
}

class VideoCard implements Insertable{
	public void insertable(){
		System.out.println("显卡现在可以插入了");
	}
}

class SoundCard implements Insertable{
	public void insertable(){
		System.out.println("听卡现在可以插入了");
	}
}

class VoiceCard implements Insertable{
	public void insertable(){
		System.out.println("声卡现在可以插入了");
	}
}