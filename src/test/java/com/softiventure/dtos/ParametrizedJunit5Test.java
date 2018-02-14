package com.softiventure.dtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Pass paramters ")
public class ParametrizedJunit5Test {

    @DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void shouldPassNonNullMessageAsMethodParameter(String message) {
        assertNotNull(message);
    }

    @ParameterizedTest
    @ValueSource(doubles = { 1.0, 2.0, 3.0 })
    void testWithValueSource(double argument) {
        assertNotNull(argument);
    }
}
