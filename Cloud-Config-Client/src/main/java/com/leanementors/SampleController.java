package com.leanementors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by khurram on 19/02/2017.
 */

@Controller
public class SampleController {

    @Value("${name}") String luckyWord;

    @RequestMapping("/lucky-word")
    public String showLuckyWord(){
        return "Hello :"+luckyWord;
    }
}
