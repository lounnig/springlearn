package cn.tokiz.web;

import cn.tokiz.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/u")
    public ModelAndView user(){
        User u  = new User();
        u.setAge(20);
        u.setUserName("tokiz");
        //javax.servlet.jsp.jstl.core.ConditionalTagSupport;
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/user");
        mav.addObject("u",u);
        return mav;
    }


}
