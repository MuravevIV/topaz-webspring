package com.ilyamur.topaz.webspring.core.model;

/**
 * Maker of the greetings.
 *
 * @author Ilya_Muravyev
 */
public interface Greeter {

    /**
     * Returns a greeting, referring by the name.
     *
     * @param name any name
     * @return polite greeting
     */
    String greet(String name);
}
