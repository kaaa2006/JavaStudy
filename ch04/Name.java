package ch04;

public class Name {

	public static void main(String[] args) {
		// name() 메서드
		Week1 today = Week1.SUNDAY;
		String name = today.name();
		System.out.println("객체의 이름은 :" + name);
		//ordinal() 메서드		
		int ordinal = today.ordinal();
		System.out.println("열거순서는 :" + ordinal);
		//전체 열거 객체중 몇 번째 열거 객체인지 알려준다.
		// 순서는 열거 선언 할 떄 첫버째 값이 0이다.
		
		//compareTo() 메서드
		Week1 day1 = Week1.MONDAY;
		Week1 day2 = Week1.WEDESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		// valueof() 메서드
		// 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다. 
		/* 외부로부터 문자열을 입력받아 열거 객체로 변환할 때 자주사용한다 */
		Week1 weekday = Week1.valueOf("MONDAY");
		if(weekday == Week1.SATURDAY || weekday == Week1.SUNDAY) {
			System.out.println("주말이군요 푹 쉬고 평일에 힘냅시다!!!!!");
		}else {
			System.out.println("평일이군요 학습을 위해 8시간 이상은 주무세요!!!!!");
		}
		// values() 메서드 
		Week1[] days = Week1.values(); //week1에 열거 상수를 days 배열로 생성
		for(Week1 a : days) {
			System.out.println(a+ " ");
		}
		
	}

}
