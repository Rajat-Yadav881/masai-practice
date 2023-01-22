package com.q3.model;

import org.springframework.stereotype.Controller;

@Controller
public class Gym {

	private int gym_id;
	private String gym_name; 
	private int monthly_fee;
	
	public Gym() {
		super();
	}

	
	public Gym(int gym_id, String gym_name, int monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}

	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
	}

	public int getGym_id() {
		return gym_id;
	}

	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}

	public String getGym_name() {
		return gym_name;
	}

	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}

	public int getMonthly_fee() {
		return monthly_fee;
	}

	public void setMonthly_fee(int monthly_fee) {
		this.monthly_fee = monthly_fee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gym_id;
		result = prime * result + ((gym_name == null) ? 0 : gym_name.hashCode());
		result = prime * result + monthly_fee;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gym other = (Gym) obj;
		if (gym_id != other.gym_id)
			return false;
		if (gym_name == null) {
			if (other.gym_name != null)
				return false;
		} else if (!gym_name.equals(other.gym_name))
			return false;
		if (monthly_fee != other.monthly_fee)
			return false;
		return true;
	}
	
	
	
}
