package org.code.armor.hashcode;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class ReaderTest {

    @Test
	public void testReadA() throws IOException {
        // 3 4 2 3 2 10
        Resolver r = new Resolver("/a_example.in");
        assertEquals(3, r.grid.rows);
        assertEquals(4, r.grid.columns);
        assertEquals(2, r.nbCar);
        assertEquals(3, r.nbRides);
        assertEquals(2, r.onTimeBonus);
        assertEquals(10, r.nbStep);
	}

    @Test
    public void testReadB() throws IOException {
        // 800 1000 100 300 25 25000
        Resolver r = new Resolver("/b_should_be_easy.in");
        assertEquals(800, r.grid.rows);
        assertEquals(1000, r.grid.columns);
        assertEquals(100, r.nbCar);
        assertEquals(300, r.nbRides);
        assertEquals(25, r.onTimeBonus);
        assertEquals(25000, r.nbStep);
    }

    @Test
    public void testReadC() throws IOException {
        // 3000 2000 81 10000 1 200000
        Resolver r = new Resolver("/c_no_hurry.in");
        assertEquals(3000, r.grid.rows);
        assertEquals(2000, r.grid.columns);
        assertEquals(81, r.nbCar);
        assertEquals(10000, r.nbRides);
        assertEquals(1, r.onTimeBonus);
        assertEquals(200000, r.nbStep);
    }


}
