package ch05.extended.lineage.DTO;

public class Account {
//필드 
	private String id;
	private String pw;
	private String nicName;
	private ElfDTO elfDTO;
	private KnightDTO knightDTO;
		
	
	//생성자
	
	
	
	//메서드
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNicName() {
		return nicName;
	}
	public ElfDTO getElfDTO() {
		return elfDTO;
	}
	public KnightDTO getKnightDTO() {
		return knightDTO;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNicName(String nicName) {
		this.nicName = nicName;
	}
	public void setElfDTO(ElfDTO elfDTO) {
		this.elfDTO = elfDTO;
	}
	public void setKnightDTO(KnightDTO knightDTO) {
		this.knightDTO = knightDTO;
	}

	
	
}
