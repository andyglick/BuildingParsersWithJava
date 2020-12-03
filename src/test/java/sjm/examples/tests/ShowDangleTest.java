package sjm.examples.tests;

import org.junit.Test;

import sjm.parse.Parser;
import sjm.parse.tokens.TokenTester;

/*
 * Copyright (c) 2000 Steven J. Metsker. All Rights Reserved.
 *
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose,
 * including the implied warranty of merchantability.
 */

/**
 * Test the statement parser from class <code>Dangle</code>.
 *
 * @author Steven J. Metsker
 * @version 1.0
 */
public class ShowDangleTest {
    /**
     * Test the statement parser from class <code>Dangle</code>.
     */
    @Test
    public void testShowDangle() {
        Parser p = Dangle.statement();
        TokenTester tt = new TokenTester(p);
        tt.setLogTestStrings(false);
        tt.test();
    }
}
