package com.cs425;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayFlattenerTest {
    ArrayFlattener arrayFlattener = new ArrayFlattener();
    @Before
    public void setup(){
        arrayFlattener = new ArrayFlattener();
    }
    @Test
    void TwoDimensionalArrayEquals1DArray(){
        int[][] input = {{ 1, 3 },{ 0 },{ 4, 5, 9 }};
        int[] expected = {1,3,0,4,5,9};
        int[] output = arrayFlattener.flattenArray(input);
        assertArrayEquals(output, expected);
    }

    @Test
    void NullInputThrowsException(){
        int[][] input = null;
        assertThrows(NullPointerException.class,()->{arrayFlattener.flattenArray(input);});
    }
}