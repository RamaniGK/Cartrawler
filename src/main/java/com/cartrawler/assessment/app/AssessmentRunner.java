package com.cartrawler.assessment.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cartrawler.assessment.car.CarObjectInput;
import com.cartrawler.assessment.car.CarResult;
import com.cartrawler.assessment.comparator.SippCodeComparator;
import com.cartrawler.assessment.comparator.SupplierComparator;
import com.cartrawler.assessment.view.Display;

public class AssessmentRunner {

	public static void main(String[] args) {

		List<CarResult> list = new ArrayList<>(CarObjectInput.CARS);

		Collections.sort(list, new SupplierComparator().thenComparing(new SippCodeComparator())
				.thenComparing(CarResult::getRentalCost));

		Display display = new Display();
		display.render(list);
	}
}
