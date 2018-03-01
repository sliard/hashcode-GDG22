package org.code.armor.hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    public Resolver(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
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
        grid.rows = Integer.getInteger(elems[0]);
        grid.columns = Integer.getInteger(elems[1]);

        nbCar = Integer.getInteger(elems[2]);
        cars = IntStream.of(nbCar).mapToObj(Car::new).collect(Collectors.toList());
        
        nbRides = Integer.getInteger(elems[3]);
        onTimeBonus = Integer.getInteger(elems[4]);
        nbStep = Integer.getInteger(elems[6]);

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
            c.startPos.x = Integer.getInteger(elems2[0]);
            c.startPos.y = Integer.getInteger(elems2[1]);
            c.stopPos.x = Integer.getInteger(elems2[2]);
            c.stopPos.x = Integer.getInteger(elems2[3]);
            c.startStep = Integer.getInteger(elems2[4]);
            c.stopStep = Integer.getInteger(elems2[5]);
            allCourses.add(c);
        }
        br.close();

    }

}
