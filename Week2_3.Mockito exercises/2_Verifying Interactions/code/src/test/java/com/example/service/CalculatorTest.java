package com.example.service;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testAddCalledOnce() {
        Calculator calculatorMock = mock(Calculator.class);
        when(calculatorMock.add(10, 20)).thenReturn(30);

        calculatorMock.add(10, 20);

        verify(calculatorMock, times(1)).add(10, 20);
    }
}
