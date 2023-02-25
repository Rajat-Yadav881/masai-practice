package com.example.geektrust.model;

public class PassengerCheckIn {

	private String metroCardNumber;
	private String passengerType;
	private String fromStation;
	private Integer charge;
	private EachJourneyCharge journeyCharge;


	public EachJourneyCharge getJourneyCharge() {
		return journeyCharge;
	}

	public void setJourneyCharge(EachJourneyCharge journeyCharge) {
		this.journeyCharge = journeyCharge;
	}

	public Integer getCharge() {
		return charge;
	}

	public void setCharge(String passengerType) {
		if (passengerType.equals("ADULT")) {
			this.charge = 200;
		} else if (passengerType.equals("SENIOR_CITIZEN")) {
			this.charge = 100;
		} else if (passengerType.equals("KID")) {
			this.charge = 50;
		}
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getMetroCardNumber() {
		return metroCardNumber;
	}

	public void setMetroCardNumber(String metroCardNumber) {
		this.metroCardNumber = metroCardNumber;
	}

	public PassengerCheckIn(String metroCardNumber, String passengerType, String fromStation) {
		super();
		this.metroCardNumber = metroCardNumber;
		this.passengerType = passengerType;
		this.fromStation = fromStation;
		setCharge(this.passengerType);
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass()) {
			return false;
		}
		PassengerCheckIn checkedIn=(PassengerCheckIn)obj;;
		return this.passengerType.equals(checkedIn.passengerType)
				&& this.fromStation.equals(checkedIn.fromStation)
				&& this.metroCardNumber.equals(checkedIn.metroCardNumber)
				&& this.charge.equals(checkedIn.charge);
	}

}

