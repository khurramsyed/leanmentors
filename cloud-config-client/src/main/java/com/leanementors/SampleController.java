package com.leanementors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by khurram on 19/02/2017.
 */

@RestController
public class SampleController {

    @Value("${lucky-word}")String luckyWord;

    @RequestMapping("/lucky-word")
    public String showLuckyWord(){
        System.out.print("Lucky words is "+ luckyWord);

        return "Hello :"+luckyWord;
    }


}
