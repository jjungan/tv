package tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	public TV() {
		// 초기값 설정
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	
	public int channelUp(){
		channel++;
		return channel;
	}
	public int channelDown(){
		channel--;
		return channel;
	}
	public int volumeUp(){
		volume++;
		return volume;
	}
	public int volumeDown(){
		volume--;
		return volume;
	}
	public boolean powerOn(){
		this.power = true;
		return power;
	}
	public boolean powerOff(){
		this.power = false;
		return power;
		
	}





}
