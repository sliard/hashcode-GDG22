package org.code.armor.hashcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resolver {

    public Grid grid;

    public Resolver(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            /**
             * R – number of rows of the grid (1≤R≤10000)
             * C – number of columns of the grid (1 ≤ C ≤ 10000)
             * F – number of vehicles in the fleet (1 ≤ F ≤ 1000)
             * N – number of rides (1≤N ≤10000)
             * B – per-ride bonus for starting the ride on time (1 ≤ B ≤ 10000)
             * T – number of steps in the simulation (1 ≤ T ≤ 109)
             */

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
