package com.cartrawler.assessment.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.cartrawler.assessment.car.CarResult;

public class SippCodeComparator implements Comparator<CarResult> {

	private static List<String> sippCodeList = Arrays.asList("M", "E", "C");

	public int compare(CarResult o1, CarResult o2) {

		if (sippCodeList.contains(o1.getCharcter(o1.getSippCode()))
				&& sippCodeList.contains(o2.getCharcter(o2.getSippCode()))) {
			return o2.getSippCode().compareTo(o1.getSippCode());
		}
		if (!sippCodeList.contains(o1.getCharcter(o1.getSippCode()))
				&& sippCodeList.contains(o2.getCharcter(o2.getSippCode()))) {
			return 1;
		}
		if (sippCodeList.contains(o1.getCharcter(o1.getSippCode()))
				&& !sippCodeList.contains(o2.getCharcter(o2.getSippCode()))) {
			return -1;
		}
		return o1.getSippCode().compareTo(o2.getSippCode());
	}

}
