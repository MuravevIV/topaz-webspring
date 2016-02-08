package com.ilyamur.topaz.webspring.ui;

import com.ilyamur.topaz.webspring.core.CoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * Application initializer.
 *
 * @author Ilya_Muravyev
 */
@SpringBootApplication
@Import({CoreConfiguration.class})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
