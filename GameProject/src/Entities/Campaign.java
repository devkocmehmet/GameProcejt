package Entities;

import java.sql.Date;

public class Campaign {
	private int id;
	private String campignName;
	private double discountRate;
	
	public Campaign(int id, String campignName, double discountRate) {
		super();
		this.id = id;
		this.campignName = campignName;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampignName() {
		return campignName;
	}

	public void setCampignName(String campignName) {
		this.campignName = campignName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}
