package ch05.extended.phone;

public class DmbCellPhone extends CellPhone {
	int channel ; //자식필드추가 

	
	
	//생성자
	DmbCellPhone(String model,String color, int channel){
		this.model =model;
		this.color =color;
		this.channel = channel;
		
	}
	
	
	//메서드
	void turnOnDmb() {
		System.out.println("채널"+ channel + "번 DMB 방송 수신을 시작합니다.");
	}// DMB 방속시작
	void changeChannelDmb(int channel) {
		this.channel = channel ; //채널번호를 입력 받아 채널 변경진행
		System.out.println("채널을 "+channel+"번으로 변경합니다.");
	}//DMB 채널변경
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
