package com.cartrawler.assessment.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.SupplierComparator;

public class SupplierComparatorTest {
	@Test
	public void testCompare() {
		CarResult obj = new CarResult("Ford Focus Estate", "SIXT", "CWMR", 222.56d, CarResult.FuelPolicy.FULLFULL);
		CarResult obj1 = new CarResult("Toyota Avensis", "CENTAURO", "IDMR", 373.69d, CarResult.FuelPolicy.FULLFULL);
		CarResult obj2 = new CarResult("Toyota Avensis", "AVIS", "IDMR", 373.69d, CarResult.FuelPolicy.FULLFULL);
		SupplierComparator supplierComparator = new SupplierComparator();
		int displayName = supplierComparator.compare(obj, obj1);
		assertEquals(-1, displayName);
		displayName = supplierComparator.compare(obj, obj2);
		assertTrue(displayName > 1);
	}
}
