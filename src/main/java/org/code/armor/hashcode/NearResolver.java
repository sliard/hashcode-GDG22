package org.code.armor.hashcode;


public class NearResolver extends Resolver {

    
    public Course getCourse(Car car, Step step) {

        int minDistance = 10000000;
        Course selectCourse = null;
        for(Course c : step.activeCourses) {
            if(!c.took && c.startStep <= step.id && c.stopStep >= step.id) {
                int distance = car.currentPosition.getDistance(c.startPos);
                if(distance < minDistance) {
                    minDistance = distance;
                    selectCourse = c;
                }
            }
        }

        return selectCourse;
    }

}
