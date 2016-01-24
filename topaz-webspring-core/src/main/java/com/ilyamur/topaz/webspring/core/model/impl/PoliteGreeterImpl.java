package com.ilyamur.topaz.webspring.core.model.impl;

import com.ilyamur.topaz.webspring.core.model.Greeter;
import org.springframework.stereotype.Component;

/**
 * Maker of the polite greetings.
 *
 * @author Ilya_Muravyev
 */
@Component
public class PoliteGreeterImpl implements Greeter {

    @Override
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}
