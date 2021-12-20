package study.inheretance;

import study.hasarelation.MyDate;

public class Patient extends Person {
	private String disesaseDesc;

	public Patient() {
		super();
		disesaseDesc = "";
	}

	public Patient(String name, MyDate dob, String disesaseDesc) {
		super(name, dob);
		this.disesaseDesc = disesaseDesc;
	}

	public String getDisesaseDesc() {
		return disesaseDesc;
	}

	public void setDisesaseDesc(String disesaseDesc) {
		this.disesaseDesc = disesaseDesc;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Patient) {
			Patient temp=(Patient)obj;
			if(this.disesaseDesc.equals(temp.disesaseDesc)&& this.getName().equals(temp.getName())&& this.getDob().equals(temp.getDob())) {
				return true;
			}else {
				return false;
			}
		}
		else
		return false;
	}

	@Override
	public String toString() {
		return "Patient [disesaseDesc=" + disesaseDesc + "]";
	}

}
