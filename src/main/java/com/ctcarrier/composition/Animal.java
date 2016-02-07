package com.ctcarrier.composition;

public class Animal {

	private String name;
	private MovingService movingService;
	
	public Animal(String name, MovingService movingService) {
		this.name = name;
		this.movingService = movingService;		
	}

	public void move(int x, int y) {
		System.out.println(String.format("%s %s", name, movingService.move(x, y)));
	}
}
