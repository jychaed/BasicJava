package e_oop.tv;

import java.util.Scanner;

public class TV {
	boolean power; // 전원 false
	int channel; // 채널 0
	int volume; // 음량 0
	
	
	final int MIN_CHANNEL = 1; // 상수로 그냥 고정함
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(){ //기본생성자를 내가 만들어서 쓰겠다
		power = false;
		channel = 1;
		volume = 5;
	}
	
	
	public static void main(String[] args) {
		// 1. TV라는 클래스를 만들어주세요
		// 2. TV의 채널과 볼륨을 변수로 만들어 주세요
		// 3. 채널 및 볼륨과 관계된 동작들을 메서드로 만들어 주세요
		// (단, 채널 및 볼륨과 관계된 동작들이 실행될 때 실행 되었다는
		//  안내를 해주세요)
		
		/*
		 * -------------------------------------------------
		 * 1. 전원 2. 채널변경 3. 채널업 4. 채널다운
		 * 5. 볼륨업 6. 볼륨다운 7. 현재정보 0. 종료
		 * -------------------------------------------------
		 * 번호 입력 >>
		 * */
		
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			System.out.println(" -------------------------------------------------");
			System.out.println(" 1. 전원 2. 채널변경 3. 채널업 4. 채널다운                     ");
			System.out.println(" 5. 볼륨업 6. 볼륨다운 7. 현재정보 0. 종료                     ");
			System.out.println(" -------------------------------------------------");
			System.out.println("번호 입력 >>");
			// art+ shift +a 블럭복사 가능
			
			int input = Integer.parseInt(sc.nextLine()); // 사용할수 있다.nextLine 메서드 실행?
//			remoteController:
			switch(input) {
			case 1:
				// 방법 1. 객체의 변수에 직접 접근하여 값을 변경한다.
				// tv.power = !tv.power;
//				if(tv.power) {
//					System.out.println("TV가 켜졌습니다.");
//				}else {
//					System.out.println("TV가 꺼졌습니다.");
//				}
				
				// 방법 2. 메소드를 이용하여 값에 접근한다.
				tv.powerToggle();
				break;
			case 2:
				System.out.println("변경하실 채널 번호 >>");
				tv.channelChange(Integer.parseInt(sc.nextLine()));
				break;		
			case 3:
				tv.channelUp();
				break;	
			case 4:
				tv.channelDown();
				break;	
			case 5:
				tv.volumeUp();
				break;	
			case 6:
				tv.volumeDown();
				break;	
				
				
			case 7:
				System.out.println(tv);
				break;
			case 0:	
				tv.powerOff();
				System.out.println("프로그램을 종료합니다.");
				flag  = false;
				break;
			}
		}
		
		
	
	}

	
	@Override
	public String toString() {
		return"현재 채널 : " + this.channel + "\n 현재 음량 : " + this.volume;
	}
	
	private void channelChange(int parseInt) {
		this.channel = parseInt;
		System.out.println("채널이" + this.channel+ "로 변경되었습니다.");
	}


	private void powerOff() {
		if(this.power) {
			System.out.println("TV가 꺼졌습니다.");
		}
		this.power = false;
	}


	public void powerToggle() {
		this.power = !this.power;
		if(this.power) {
			System.out.println("TV가 켜졌습니다.");
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}

	
	public void channelUp() {
		if(this.power) {
			this.channel++; 
			if(this.channel > this.MAX_CHANNEL) {
				this.channel = this.MIN_CHANNEL;
			}	
			System.out.println("채널 " + this.channel +"로 변경되었습니다." );
		}else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
	
	
	public void channelDown() {
		if(this.power) {
			this.channel--; 
			if(this.channel < this.MIN_CHANNEL) {
				this.channel = this.MAX_CHANNEL;
			}
			System.out.println("채널 " + this.channel +"로 변경되었습니다." );
		}else {
			System.out.println("전원이 꺼져 있습니다.");
		}
			
	}
	
	public void volumeUp() {
		this.volume++; 
		if(this.volume > this.MAX_VOLUME) {
			this.volume = this.MAX_VOLUME;
		}
			System.out.println(" TV 음량 " + this.volume );
		
	}
	
	public void volumeDown() {
		this.volume--; 
		if(this.volume < this.MIN_VOLUME) {
			this.volume = this.MIN_VOLUME;
		}
			System.out.println(" TV 음량 " + this.volume );
		
	}
	
	public void state() {
		
	}
	
	
}
