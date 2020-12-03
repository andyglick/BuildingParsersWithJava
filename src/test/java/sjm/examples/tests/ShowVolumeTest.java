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
 * Test the query parser from class <code>VolumeQuery
 * </code>.
 *
 * @author Steven J. Metsker
 * @version 1.0
 */
public class ShowVolumeTest {
    /**
     * Test the query parser from class <code>VolumeQuery
     * </code>.
     */
    @Test
    public void testShowVolume() {
        Parser p = VolumeQuery.query();
        TokenTester tt = new TokenTester(p);
        tt.test();
    }
}
