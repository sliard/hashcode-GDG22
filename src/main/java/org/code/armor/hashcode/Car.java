package org.code.armor.hashcode;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	public int id;
	
	public Position currentPosition = new Position();
	
	public List<Course> courses = new ArrayList<>();
	public Course currentCourse;
	public int availableStep;

	public Car(int id) {
		this.id = id;
	}
	
	
}
