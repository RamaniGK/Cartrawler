package com.cartrawler.assessment.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.cartrawler.assessment.car.CarResult;

public class SupplierComparator implements Comparator<CarResult> {

	private static List<String> corporateCars = Arrays.asList("AVIS", "BUDGET", "ENTERPRISE", "FIREFLY", "HERTZ",
			"SIXT", "THRIFTY");

	public int compare(CarResult o, CarResult o2) {
		if (corporateCars.contains(o.getSupplierName()) && corporateCars.contains(o2.getSupplierName())) {
			return o.getSupplierName().compareTo(o2.getSupplierName());
		}
		if (corporateCars.contains(o.getSupplierName())) {
			return -1;
		}
		if (corporateCars.contains(o2.getSupplierName())) {
			return 1;
		}
		return o.getSupplierName().compareTo(o2.getSupplierName());

	}

}
