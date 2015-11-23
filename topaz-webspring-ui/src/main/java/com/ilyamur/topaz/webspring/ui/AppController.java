package com.ilyamur.topaz.webspring.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Application web controller.
 */
@Controller
public class AppController {

    /**
     * Handle main index page loading.
     *
     * @return main page response
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return "ok";
    }
}
