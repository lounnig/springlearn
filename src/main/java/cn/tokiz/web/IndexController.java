package cn.tokiz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(){
        return "redirect:/index";

    }

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
