/**
* Filename : PcInterfacePci.java
* Author : huyn
* Creation time : ����10:25:35 - 2018��12��26��
* Description :
*/
package com.meego.day6;
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
		System.out.println("����Pci�����");
	}
}


interface Insertable{
	public void insertable();
}

class VideoCard implements Insertable{
	public void insertable(){
		System.out.println("�Կ����ڿ��Բ�����");
	}
}

class SoundCard implements Insertable{
	public void insertable(){
		System.out.println("�������ڿ��Բ�����");
	}
}

class VoiceCard implements Insertable{
	public void insertable(){
		System.out.println("�������ڿ��Բ�����");
	}
}