package com.softiventure.dtos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedOldWayTest {

    @Parameterized.Parameter(0)
    public int param1;

    @Parameterized.Parameter(1)
    public int param2;

    @Parameterized.Parameter(2)
    public int output;

    @Parameterized.Parameters(name = "{index} : sum({0},{1})={2}")
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {1, 4, 5}
        });
    }

    @Test
    public void testSum() {

        assertEquals(output, param1 + param2);
    }

}
