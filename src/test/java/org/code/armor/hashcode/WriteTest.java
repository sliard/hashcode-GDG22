package org.code.armor.hashcode;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class WriteTest {

    private Class<? extends Resolver> resolverClass = NoResolver.class;

    @Test
	public void writeTestA() throws Exception {
        Resolver r = resolverClass.newInstance();
        r.readFile("/a_example.in");
        r.run();
        r.printSolution();
	}


}
