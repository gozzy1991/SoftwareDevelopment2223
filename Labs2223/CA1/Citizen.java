package CA1;

public class Citizen {

	public Citizen (String firstName, String lastName, String gender, String mStatus, String maiName) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
		setmStatus(mStatus);
		setMaiName(maiName);
		PPS = PPS++;
		
	}
	private String firstName;
	private String lastName;
	private String gender;
	private String mStatus;
	private String maiName;
	
	
	private int noOfRecords;
	private int PPS = 1000;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getmStatus() {
		return mStatus;
	}
	public void setmStatus(String mStatus) {
		this.mStatus = mStatus;
	}
	public String getMaiName() {
		return maiName;
	}
	public void setMaiName(String maiName) {
		this.maiName = maiName;
	}
	public int getPPS() {
		return PPS;
	}
	public void setPPS(int pPS) {
		PPS = pPS;
	}
	
}
