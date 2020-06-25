package com.demo;

public class BasketballCoaching implements Coach {

	private FortuneService fortuneService;
	
	
	public BasketballCoaching(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Basketball Coaching is going on ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
