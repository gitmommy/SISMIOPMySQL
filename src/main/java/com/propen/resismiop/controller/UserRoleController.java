package com.propen.resismiop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.propen.resismiop.model.UserRoleModel;
import com.propen.resismiop.sevice.UserRoleService;;


@Controller
@RequestMapping("/user")
public class UserRoleController {
    @Autowired
    private UserRoleService userService;

    @RequestMapping(value= "/addUser", method = RequestMethod.POST)
    private String addUserSubmit(@ModelAttribute("newUser") UserRoleModel newUser){
        userService.addUser(newUser);
        System.out.println("masuk");
        System.out.println(newUser.getUsername());
        System.out.println(newUser.getRole());
        return "redirect:/";
    }

}
