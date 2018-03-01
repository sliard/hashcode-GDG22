package org.code.armor.hashcode;


public class StupidResolver extends Resolver {

    
    public Course getCourse(Car car, Step step) {
        for(Course c : step.activeCourses) {
            if(!c.took && c.startStep <= step.id && c.stopStep >= step.id) {
                return c;
            }
        }

        return null;
    }

}
