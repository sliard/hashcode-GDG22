package org.code.armor.hashcode;

public class Course {

	public int id;
	public Position startPos;
	public Position stopPos;
	public int startStep;
	public int stopStep;

	public Course() {
		startPos = new Position();
		stopPos = new Position();
	}
	
	public int getDistance() {
		return startPos.getDistance(stopPos);
	}
}
