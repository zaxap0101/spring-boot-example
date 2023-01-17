package com.azazel.greetresponse.controllergretresponce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/controller")
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value="/r", method= RequestMethod.GET)
    public String run(){
        return "run";
    }

}
