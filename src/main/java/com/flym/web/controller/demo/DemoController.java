package com.flym.web.controller.demo;

import com.flym.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 4/27/2017.
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController extends BaseController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
