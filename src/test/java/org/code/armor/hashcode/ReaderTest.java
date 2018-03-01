package org.code.armor.hashcode;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class ReaderTest {
	
	//private Class<? extends Resolver> resolverClass = NoResolver.class;

	private Class<? extends Resolver> resolverClass = NicoResolver.class;
	

    @Test
	public void testReadA() throws Exception {
        // 3 4 2 3 2 10
        Resolver r = resolverClass.newInstance();
        r.readFile("/a_example.in");
        assertEquals(3, r.grid.rows);
        assertEquals(4, r.grid.columns);
        assertEquals(2, r.nbCar);
        assertEquals(3, r.nbRides);
        assertEquals(2, r.onTimeBonus);
        assertEquals(10, r.nbStep);
	}

    @Test
    public void testReadB() throws Exception {
        // 800 1000 100 300 25 25000
        Resolver r = resolverClass.newInstance();
        r.readFile("/b_should_be_easy.in");
        assertEquals(800, r.grid.rows);
        assertEquals(1000, r.grid.columns);
        assertEquals(100, r.nbCar);
        assertEquals(300, r.nbRides);
        assertEquals(25, r.onTimeBonus);
        assertEquals(25000, r.nbStep);
    }

    @Test
    public void testReadC() throws Exception {
        // 3000 2000 81 10000 1 200000
        Resolver r = resolverClass.newInstance();
        r.readFile("/c_no_hurry.in");
        assertEquals(3000, r.grid.rows);
        assertEquals(2000, r.grid.columns);
        assertEquals(81, r.nbCar);
        assertEquals(10000, r.nbRides);
        assertEquals(1, r.onTimeBonus);
        assertEquals(200000, r.nbStep);
    }

    @Test
    public void testReadD() throws Exception {
        // 10000 10000 400 10000 2 50000
        Resolver r = resolverClass.newInstance();
        r.readFile("/d_metropolis.in");
        assertEquals(10000, r.grid.rows);
        assertEquals(10000, r.grid.columns);
        assertEquals(400, r.nbCar);
        assertEquals(10000, r.nbRides);
        assertEquals(2, r.onTimeBonus);
        assertEquals(50000, r.nbStep);
    }

    @Test
    public void testReadE() throws Exception {
        // 1500 2000 350 10000 1000 150000
        Resolver r = resolverClass.newInstance();
        r.readFile("/e_high_bonus.in");
        assertEquals(1500, r.grid.rows);
        assertEquals(2000, r.grid.columns);
        assertEquals(350, r.nbCar);
        assertEquals(10000, r.nbRides);
        assertEquals(1000, r.onTimeBonus);
        assertEquals(150000, r.nbStep);
    }

}
