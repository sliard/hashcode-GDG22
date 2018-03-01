package org.code.armor.hashcode;

public class NicoResolver extends Resolver {

	
    public Course getActiveCourse(Car car, Step step, int maxDistance) {
    	for (Course course : step.activeCourses) {
    		if (!course.took && car.currentPosition.getDistance(course.startPos) < maxDistance) {
    			return course;
    		}
    	}
    	return null;
    }
    
    @Override
    public Course getCourse(Car car, Step step) {
    	int maxDistance = 0;
    	for (int i = step.id; i < nbStep; i++) {
    		maxDistance++;
    		Step step2 = steps.get(i);
    		Course course  = getActiveCourse(car, step2, maxDistance);
    		if (course != null)
    			return course;
    	}
    	return null;
    }
}
