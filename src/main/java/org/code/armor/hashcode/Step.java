package org.code.armor.hashcode;

import java.util.ArrayList;
import java.util.List;

public class Step {

	public int id;
	
	public List<Course> startingCourses = new ArrayList<>();
	
	public List<Course> activeCourses = new ArrayList<>();

	public Step(int id) {
		this.id = id;
	}

	
}
