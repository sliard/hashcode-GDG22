package org.code.armor.hashcode;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class WriteTest {

    private Class<? extends Resolver> resolverClass = StupidResolver.class;
//    private Class<? extends Resolver> resolverClass = NicoResolver.class;

    @Test
	public void writeTestA() throws Exception {
        Resolver r = resolverClass.newInstance();
        r.readFile("/a_example.in");
        r.run();
        r.writeSolution();
	}

    @Test
    public void writeTestB() throws Exception {
        Resolver r = resolverClass.newInstance();
        r.readFile("/b_should_be_easy.in");
        r.run();
        r.writeSolution();
    }

    @Test
    public void writeTestC() throws Exception {
        Resolver r = resolverClass.newInstance();
        r.readFile("/c_no_hurry.in");
        r.run();
        r.writeSolution();
    }

    @Test
    public void writeTestD() throws Exception {
        Resolver r = resolverClass.newInstance();
        r.readFile("/d_metropolis.in");
        r.run();
        r.writeSolution();
    }

    @Test
    public void writeTestE() throws Exception {
        Resolver r = resolverClass.newInstance();
        r.readFile("/e_high_bonus.in");
        r.run();
        r.writeSolution();
    }

}
