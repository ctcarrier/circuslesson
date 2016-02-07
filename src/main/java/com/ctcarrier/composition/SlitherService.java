package com.ctcarrier.composition;

public class SlitherService implements MovingService {

	@Override
	public String move(int x, int y) {
		return String.format("sliters to %d %d", x, y);
	}

	
}
