package org.code.armor.hashcode;


public class StupidResolver extends Resolver {

    
    public Course getCourse(Car car, Step step) {
        for(Course c : allCourses) {
            if(!c.took) {
                return c;
            }
        }

        return null;
    }

}
