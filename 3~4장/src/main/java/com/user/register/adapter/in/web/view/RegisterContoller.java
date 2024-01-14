package com.user.register.adapter.in.web.view;

import com.user.register.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterContoller {
    @RequestMapping("/register")
    public String test(Model model){
        model.addAttribute("userInfo",new User());
        return "register.html";
    }
}
