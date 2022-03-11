package study.beans;

public class CardsBean {

	private String pan,adhar,voterID,passport;

	

	public CardsBean() {

	
	}

	@Override
	public String toString() {
		return "CardsBean [pan=" + pan + ", adhar=" + adhar + ", voterID=" + voterID + ", passport=" + passport + "]";
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getVoterID() {
		return voterID;
	}

	public void setVoterID(String voterID) {
		this.voterID = voterID;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	
	
}
