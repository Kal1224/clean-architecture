package com.user.register.adapter;

import com.user.register.domain.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

@Controller
public class Register {
    @RequestMapping("/register")
    public String test(Model model){
        model.addAttribute("userInfo",new UserInfo());
        return "register.html";
    }
}
