package sjm.examples.tests;

import org.junit.Test;

import sjm.examples.regular.RegularParser;
import sjm.parse.chars.CharacterTester;

/*
 * Copyright (c) 2000 Steven J. Metsker. All Rights Reserved.
 *
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose,
 * including the implied warranty of merchantability.
 */

/**
 * Test the <code>RegularParser</code> class.
 *
 * @author Steven J. Metsker
 * @version 1.0
 */
public class ShowRegularTest {
    /**
     * Test the <code>RegularParser</code> class.
     */
    @Test
    public void testShowRegular() {
        new CharacterTester(RegularParser.start()).test();
    }
}
