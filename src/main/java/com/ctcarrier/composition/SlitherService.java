package com.ctcarrier.composition;

public class SlitherService implements MovingService {

	@Override
	public String move(int x, int y) {
		return String.format("slithers to %d %d", x, y);
	}

	
}
