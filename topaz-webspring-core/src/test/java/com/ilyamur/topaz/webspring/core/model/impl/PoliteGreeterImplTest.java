package com.ilyamur.topaz.webspring.core.model.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * PoliteGreeterImpl tests.
 *
 * @author Ilya_Muravyev
 */
public class PoliteGreeterImplTest {

    PoliteGreeterImpl target = new PoliteGreeterImpl();

    @Test
    public void greet() {
        String greeting = target.greet("John");

        assertEquals("Hello, John!", greeting);
    }
}
