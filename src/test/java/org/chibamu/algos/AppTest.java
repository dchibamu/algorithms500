package org.chibamu.algos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Integer[] expectedResult = {1, 2, 3, 5, 6, 8, 9, 10, 15};
        App app = new App();
        Integer[] X = {null, 2, null, 3, null, 5, 6, null, null};
        Integer[] Y = {1, 8, 9, 10, 15};
        app.merge(X, Y);
        assertArrayEquals(expectedResult, X);
    }

    @Test
    public void shouldSuccessfullyMergeTwoSortedArrays()
    {
        int[] X = {4, 6, 8, 9, -1, -1, -1};
        int[] Y = {1, 2, 11};

        int[] exepectedResult = {1, 2, 4, 6, 8, 9, 11};
        App app = new App();
        app.mergeTwoSortedArrays(X, Y);
        assertArrayEquals(exepectedResult, X);
    }
}
