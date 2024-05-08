package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-07 08:02
 */
@Controller
public class AttrController {
    @GetMapping("attr")
    public String attrDemo(Model model) {
        model.addAttribute("myAction", "/user/login");
        model.addAttribute("myText", "请登录!");
        return "attr";
    }
}
