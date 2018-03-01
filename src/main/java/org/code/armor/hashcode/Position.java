package org.code.armor.hashcode;

public class Position {

	public int x;
	public int y;
	
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getDistance(Position position) {
		return Math.abs(position.x - x) + Math.abs(position.y  - y);
	}
}
