package org.code.armor.hashcode;

public class Course {

	public Position startPos;
	public Position stopPos;
	public int startStep;
	public int stopStep;
	
	public int getDistance() {
		return startPos.getDistance(stopPos);
	}
}
