package test.DTO;

public class TotalDTO extends MemberDTO {
	// 부모로부터 상속받은 객체
	private int kors; // 국어
	private int mats; // 수학
	private int engs; // 영어
	private int total; // 초합
	private double avg; // 평균
	// 생성자 ->소스 유징필드

	public TotalDTO(int kors, int mats, int engs, int total, double avg) {
		super();
		this.kors = kors;
		this.mats = mats;
		this.engs = engs;
		this.total = total;
		this.avg = avg;

	}

	// 게터세터
	public int getKors() {
		return kors;
	}

	public int getMats() {
		return mats;
	}

	public int getEngs() {
		return engs;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public void setKors(int kors) {
		this.kors = kors;
	}

	public void setMats(int mats) {
		this.mats = mats;
	}

	public void setEngs(int engs) {
		this.engs = engs;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
