package com.cartrawler.assessment.car;

public class CarResult {
	private final String description;
	private final String supplierName;
	private final String sippCode;
	private final double rentalCost;
	private final FuelPolicy fuelPolicy;

	public enum FuelPolicy {
		FULLFULL, FULLEMPTY
	};

	public CarResult(String description, String supplierName, String sipp, double cost, FuelPolicy fuelPolicy) {
		super();
		this.description = description;
		this.supplierName = supplierName;
		this.sippCode = sipp;
		this.rentalCost = cost;
		this.fuelPolicy = fuelPolicy;
	}

	public String getDescription() {
		return this.description;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public String getSippCode() {
		return this.sippCode;
	}

	public double getRentalCost() {
		return this.rentalCost;
	}

	public FuelPolicy getFuelPolicy() {
		return this.fuelPolicy;
	}

	public boolean equals(Object obj) {
		if (obj instanceof CarResult) {
			CarResult cr = (CarResult) obj;
			return (cr.description.equals(this.description) && cr.supplierName == this.supplierName
					&& cr.sippCode == this.sippCode && cr.rentalCost == this.rentalCost
					&& cr.fuelPolicy == this.fuelPolicy);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return supplierName + " : " + description + " : " + sippCode + " : " + rentalCost + " : " + fuelPolicy;
	}

	public String getCharcter(String sippCode) {
		return "" + sippCode.charAt(0);
	}

}
