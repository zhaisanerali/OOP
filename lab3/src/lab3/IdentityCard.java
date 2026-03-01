package lab3;

enum IDStatus { ACTIVE, EXPIRED, LOST, TERMINATED}

public class IdentityCard {
	public static int totalIssuedCards = 0;
	public static final String ISSUING_COUNTRY = "KAZAKHSTAN";
	private final String idNumber;
	private String fullname;
	private IDStatus status;
	
	
	
	{
		totalIssuedCards++;
	};
	
	
	public IdentityCard( String fullname, String idNumber) {
		this.fullname = fullname;
		this.idNumber = idNumber;
		this.status = IDStatus.ACTIVE;
	}
	
	
	
	public boolean checkValidity() {
		return this.status == IDStatus.ACTIVE;
		
	}
	
	
	
	
	public boolean checkValidity(int currentAge) {
		if (currentAge == 25 || currentAge == 45) {
			this.status = IDStatus.EXPIRED;
			System.out.println("Вам " + currentAge + ". Документ подлежит замене!");
			
			return false;
		}
		return this.checkValidity();
	}
	
	
	public boolean checkValidity(int currentYear, int expireYear) {
		if (currentYear > expireYear) {
			this.status = IDStatus.EXPIRED;
			return false;
		}
		return this.checkValidity();
	}
	
	
	
	
	
	public String getFullname() {
		return fullname;
	}
	
	
	public String getIDNumber() {
		return idNumber;
	}
	
	
	
	
	
	

}
