package com.propen.resismiop.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.propen.resismiop.model.UserRoleModel;

@Controller
public class PageController {

        @RequestMapping("/")
        public String home() {
            return "home";
        }

        @RequestMapping("/login")
        public String login(Model model) {
            model.addAttribute("newUser", new UserRoleModel());
            return "login";
        }
    }

