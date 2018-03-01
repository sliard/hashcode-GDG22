package org.code.armor.hashcode;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NicoResolver extends Resolver {

	private Logger logger = LoggerFactory.getLogger(getClass());

    public Course getStartCourse(Car car, List<Course> list, int maxDistance) {
    	Iterator<Course> it = list.iterator();
    	while (it.hasNext()) {
			Course course = (Course) it.next();
			if (course.took)
				it.remove();
			else if (car.currentPosition.getDistance(course.startPos) < maxDistance) {
    			return course;
    		}
    	}
    	return null;
    }
	
 
    @Override
    public Course getCourse(Car car, Step step) {
    	int maxDistance = 0;
    	for (int i = step.id; i < Math.min(step.id + 400, nbStep); i++) {
    		maxDistance++;
    		Step step2 = steps.get(i);
			//logger.info("Search course at " + step2.id);
    		Course course  = getStartCourse(car, step2.startingCourses, maxDistance);
    		if (course != null) {
    			logger.info("Got course " + course.id);
    			return course;
    		}
//    		course  = getStartCourse(car, step2.activeCourses, maxDistance);
//    		if (course != null)
//    			return course;
    	}
    	for (int i = step.id; i < Math.min(step.id + 400, nbStep); i++) {
    		maxDistance++;
    		Step step2 = steps.get(i);
			//logger.info("Search course at " + step2.id);
    		Course course  = getStartCourse(car, step2.activeCourses, maxDistance);
    		if (course != null) {
    			logger.info("Got course " + course.id);
    			return course;
    		};
    	}
    	return null;
    }
}
