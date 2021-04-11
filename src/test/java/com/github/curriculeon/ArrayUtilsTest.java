package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtilsTest {
    @Test
    public void test1() {
        Integer start = 0;
        Integer end = 10;
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] actual = ArrayUtils.getRange(start, end);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Integer start = 5;
        Integer end = 10;
        Integer[] expected = {5, 6, 7, 8, 9, 10};
        Integer[] actual = ArrayUtils.getRange(start, end);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Integer start = -10;
        Integer end = 0;
        Integer[] expected = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0};
        Integer[] actual = ArrayUtils.getRange(start, end);
        Assert.assertArrayEquals(expected, actual);
    }
}