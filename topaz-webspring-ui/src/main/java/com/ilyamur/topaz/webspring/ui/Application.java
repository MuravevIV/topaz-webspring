package com.ilyamur.topaz.webspring.ui;

import com.ilyamur.topaz.webspring.core.CoreConfiguration;
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
}
