package com.masai.model;

public class AccountDTO {
	private int srcAccno;
	private int desAccno;
	private int amount;
	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDTO(int srcAccno, int desAccno, int amount) {
		super();
		this.srcAccno = srcAccno;
		this.desAccno = desAccno;
		this.amount = amount;
	}
	public int getSrcAccno() {
		return srcAccno;
	}
	public void setSrcAccno(int srcAccno) {
		this.srcAccno = srcAccno;
	}
	public int getDesAccno() {
		return desAccno;
	}
	public void setDesAccno(int desAccno) {
		this.desAccno = desAccno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
