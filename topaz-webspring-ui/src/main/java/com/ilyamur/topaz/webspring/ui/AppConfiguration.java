package com.ilyamur.topaz.webspring.ui;

import com.ilyamur.topaz.webspring.core.CoreConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Application spring java configuration.
 *
 * @author Ilya_Muravyev
 */
@Configuration
@Import({CoreConfiguration.class})
@ComponentScan
public class AppConfiguration {
}
