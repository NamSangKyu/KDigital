package method;

public class TV {
	boolean power;
	int channel;
	int volume;
	boolean mute;
	
	public TV() {
		channel = 10;
		volume = 15;
	}
	
//	전원OnOff() - void
	void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
			
	}
//	음소거OnOff() - void
	void muteOnOff() {
		if(!power) return;
		mute = !mute;
		if(mute)
			System.out.println("음소거 활성화");
		else
			System.out.println("음소거 비활성화");
	}
//	채널Up() - void
	void channelUp() {
		if(!power) return;
		channel++;
		if(channel > 256) channel = 1;
		System.out.println("현재 채널 : "+channel);
	}
//	채널Down() - void
	void channelDown() {
		if(!power) return;
		channel--;
		if(channel < 1) channel = 256;
		System.out.println("현재 채널 : "+channel);
	}
//	음량Up() - void
	void volumeUp() {
		if(!power) return;
		if(mute) muteOnOff();
		if(volume < 50) volume++;
		System.out.println("현재 음량 : "+volume);
	}
//	음량Down() - void
	void volumeDown() {
		if(!power) return;
		if(mute) muteOnOff();
		if(volume > 0) volume--;
		System.out.println("현재 음량 : "+volume);
	}
	
}



