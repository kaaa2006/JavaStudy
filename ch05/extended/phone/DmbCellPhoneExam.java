package ch05.extended.phone;

public class DmbCellPhoneExam extends CellPhone{

	public static void main(String[] args) {
		
		DmbCellPhone dmbPhone = new DmbCellPhone("디엠비폰", "빨강", 10);
//생성자로 초기값을 전당한다. (모델명,색상,채널번)
		System.out.println("모델 :" + dmbPhone.model);
		System.out.println("색상 :" + dmbPhone.color);
		//부모로부터 받은필드 출력
		System.out.println("채널번호 :" + dmbPhone.channel);
		System.out.println("----------------------------");
		//전화에 대한 부모 메서드 활용
		dmbPhone.powerOn();//전원ON
		dmbPhone.powerOff();//전원OFF
		dmbPhone.sendVoice("여보세요.");
		dmbPhone.receoveVoice("안녕하세요.");
		dmbPhone.sendVoice("반갑습니다.");
		dmbPhone.receoveVoice("테스트 종료합니다 안녕히 계세요");
		dmbPhone.hangup(); //종료
		System.out.println("-----------------------------");
		//dmb에 대한 방속 자식 메소드 활용
		dmbPhone.turnOnDmb();//전원ON
		dmbPhone.changeChannelDmb(12);//채널변경
		dmbPhone.turnOffDmb();//전원OFF
	}

}
