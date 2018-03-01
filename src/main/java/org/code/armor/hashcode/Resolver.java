package org.code.armor.hashcode;

import sun.misc.ClassLoaderUtil;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Resolver {

    public Grid grid;
    public int nbCar;
    public int nbRides;

    public int onTimeBonus;
    public int nbStep;

    public List<Course> allCourses;

    public List<Car> cars;

    public List<Step> steps;


    public Resolver(String fileName) throws IOException {

        InputStream is = Resolver.class.getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String line;

        /**
         * First line
         * R – number of rows of the grid (1≤R≤10000)
         * C – number of columns of the grid (1 ≤ C ≤ 10000)
         * F – number of vehicles in the fleet (1 ≤ F ≤ 1000)
         * N – number of rides (1≤N ≤10000)
         * B – per-ride bonus for starting the ride on time (1 ≤ B ≤ 10000)
         * T – number of steps in the simulation (1 ≤ T ≤ 109)
         */
        line = br.readLine();
        if(line == null) {
            throw new IOException("no line");
        }
        String[] elems = line.split(" ");
        if(elems.length != 6) {
            throw new IOException("bad first line");
        }
        grid = new Grid();
        grid.rows = Integer.parseInt(elems[0]);
        grid.columns = Integer.parseInt(elems[1]);

        nbCar = Integer.parseInt(elems[2]);
        nbRides = Integer.parseInt(elems[3]);
        onTimeBonus = Integer.parseInt(elems[4]);
        nbStep = Integer.parseInt(elems[5]);

        cars = IntStream.of(nbCar).mapToObj(Car::new).collect(Collectors.toList());

        /**
         * a – the row of the start intersection (0 ≤ a < R)
         * b – the column of the start intersection (0 ≤ b < C )
         * x – the row of the finish intersection (0 ≤ x < R)
         * y – the column of the finish intersection (0 ≤ y < C )
         * s – the earliest start(0≤s<T)
         * f – the latest finish(0≤f ≤T), (f ≥s+|x−a|+|y−b|)
         */

        allCourses = new ArrayList<>();

        int i = 0;
        while ((line = br.readLine()) != null) {
            Course c = new Course();
            String[] elems2 = line.split(" ");
            c.id = i++;
            c.startPos.x = Integer.parseInt(elems2[0]);
            c.startPos.y = Integer.parseInt(elems2[1]);
            c.stopPos.x = Integer.parseInt(elems2[2]);
            c.stopPos.x = Integer.parseInt(elems2[3]);
            c.startStep = Integer.parseInt(elems2[4]);
            c.stopStep = Integer.parseInt(elems2[5]);
            allCourses.add(c);
        }
        br.close();

        steps = IntStream.of(nbStep).mapToObj(Step::new).collect(Collectors.toList());

        for (Course course : allCourses) {
        	steps.get(course.startStep).activeCourses.add(course);
        	IntStream.range(course.startStep, course.stopStep - course.getDistance())
        		.forEach(j-> steps.get(j).activeCourses.add(course));
        };

    }


    public void run() {

        for(Step step : steps) {
            for(Car car : cars) {
                if(car.currentCourse == null) {
                    //
                } else if(car.availableStep == step.id) {
                    // calcule score
                }
            }
        }
    }
}
