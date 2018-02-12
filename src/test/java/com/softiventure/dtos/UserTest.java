package com.softiventure.dtos;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {


    @Test
    public void test() {
        assertEquals("Jack", User.builder()
                .name("Jack")
                .build().getName()
        );

    }
}