package com.cs425;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


class ArrayReversorTest {
    private ArrayFlattener arrayFlattenerMock;
    private ArrayReversor arrayReversor;
    @BeforeEach
    void setUp() {
        arrayFlattenerMock = mock(ArrayFlattener.class);
        arrayReversor = new ArrayReversor(arrayFlattenerMock);

    }
    @Test
    void TwoDimensionlArrayReversedTo1D(){
        int[][] input = { { 1, 3 },{ 0 },{ 4, 5, 9 }};
        var reversed = new int[]{9,5,4,0,3,1};
        assertArrayEquals(reversed, arrayReversor.reverseArray(input));
    }

    @Test
    void NullInputThrowsException(){
        int[][] input = null;
        assertThrows(NullPointerException.class, ()->{arrayReversor.reverseArray(input);});
    }
}