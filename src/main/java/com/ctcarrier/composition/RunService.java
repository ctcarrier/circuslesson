package com.ctcarrier.composition;

public class RunService implements MovingService {

	@Override
	public String move(int x, int y) {
		return String.format("runs to %d %d", x, y);
	}

	
}
