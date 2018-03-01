package org.code.armor.hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resolver {

    public Grid grid;
    public int nbCar;
    public int nbRides;

    public int onTimeBonus;
    public int nbStep;

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
        nbRides = Integer.getInteger(elems[3]);
        onTimeBonus = Integer.getInteger(elems[4]);
        nbStep = Integer.getInteger(elems[6]);

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }

}
