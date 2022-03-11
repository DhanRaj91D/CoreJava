package study.beans;

import org.springframework.stereotype.Component;

@Component
public class CardsBean {

	private String pan,adhar,voterID,passport;

	

	public CardsBean() {

		this.setAdhar("1111111");
		this.setPan("2222");
		this.setPassport("333333333");
		this.setVoterID("444444");
	
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
