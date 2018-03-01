package org.code.armor.hashcode;

public class Position {

	public int x;
	public int y;

	public int getDistance(Position position) {
		return Math.abs(position.x - x) + Math.abs(position.y  - y);
	}
}
