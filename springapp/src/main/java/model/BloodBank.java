package model;


public class BloodBank {


	private String bloodBankID;
	private String bloodGroup;
	private String bloodPressure;
	private String phLevel;
	private int quantity;

	public String getBloodBankID() {
		return bloodBankID;
	}

	public void setBloodBankID(String bloodBankID) {
		this.bloodBankID = bloodBankID;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getPhLevel() {
		return phLevel;
	}

	public void setPhLevel(String phLevel) {
		this.phLevel = phLevel;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
