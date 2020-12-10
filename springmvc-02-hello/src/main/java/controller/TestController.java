package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(Model m){
        m.addAttribute("test","test mvc");
        return "test";
    }
}
