package com.ilyamur.topaz.webspring.ui;

import com.ilyamur.topaz.webspring.core.model.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Application web controller.
 *
 * @author Ilya_Muravyev
 */
@Controller
public class ApplicationController {

    @Autowired
    private Greeter greeter;

    /**
     * Handle main index page loading.
     *
     * @return main page response
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "ok";
    }

    /**
     * Handle greetings page loading.
     *
     * @return greetings page response
     */
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    @ResponseBody
    public String greet(@RequestParam String name) {
        return greeter.greet(name);
    }

    /**
     * Handle thymeleaf test page loading.
     *
     * @return thymeleaf test template name
     */
    @RequestMapping(value = "/thymeleaf_test")
    public String thymeleafTest() {
        return "thymeleaf_test";
    }
}
