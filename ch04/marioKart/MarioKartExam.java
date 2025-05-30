package ch04.marioKart;

import java.util.Scanner;

import ch04.marioKart.service.CartService;
import ch04.marioKart.service.MemberService;
import ch04.marioKat.DTO.CartDTO;
import ch04.marioKat.DTO.CharacterDTO;
import ch04.marioKat.DTO.GliderDTO;
import ch04.marioKat.DTO.ItemDTO;
import ch04.marioKat.DTO.MemberDTO;
import ch04.marioKat.DTO.TireDTO;

public class MarioKartExam {
	//필드
	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10];//회원수 10명
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15]; //캐릭터 15개
	public static CartDTO[] cartDTOs = new CartDTO[8]; //카트 수
	public static GliderDTO[] gliderDTOs = new GliderDTO[10]; // 글라이더 배열
	public static TireDTO[] tireDTOs = new TireDTO[10]; //타이어 배열 
	public static ItemDTO[] itemDTOs = new ItemDTO[10]; // 아이템 배열
	
	private static MemberDTO loginState;// 세션기능
	
	
	
	
	
	
	
	
	// 생성자 -> new mariokartExam() 으로 객체를 생성하지 않는다
	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오",3.0,4.5,3.7,4.1,3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루아자",3.2,4.4,3.1,4.4,3.2);
		CharacterDTO characterDTO2= new CharacterDTO("와리오",3.3,4.7,3.2,4.2,3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치",3.1,4.1,3.4,4.5,3.5);
		//객체 생성
		//객체를 배열에 넣어 관리
		characterDTOs[0] = characterDTO0 ;
		characterDTOs[1] = characterDTO1 ;
		characterDTOs[2] = characterDTO2 ;
		characterDTOs[3] = characterDTO3 ;
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("마리오 카트 게임을 시작합니다.");
		boolean run = true;
		while(run) {
			System.out.println("1.회원관리|2.카트관리|3.게임시작|4.게임종료");
			System.out.print(">>>");
			String select = input.next();
			switch(select) {
			case "1":
				System.out.println("회원관리 클래스로 이동합니다.");
				MemberService memberService = new MemberService() ;
				loginState = memberService.menu(input, memberDTOs , (MemberDTO) loginState);
				
				break;
			case "2":
				System.out.println("카트관리 클래스로 이동합니다.");
				CartService cartService = new CartService();
								break;
			case "3":
				System.out.println("게임시작 클래스로 이동합니다.");
				break;
			case "4":
				System.out.println("게임을 종료 합니다.");
				run = false;
				break;
			default :
				System.out.println("*(1~4)*까지만 입력해주세요)");
			}
		}
	}

}
