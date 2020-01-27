package com.cartrawler.assessment.view;

import java.util.List;

import com.cartrawler.assessment.car.CarResult;

public class Display {
	
    public void render(List<CarResult> cars) {
        for (CarResult car : cars) {
            System.out.println (car);
        }
    }
}
