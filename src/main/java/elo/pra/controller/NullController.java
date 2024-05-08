package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-07 06:12
 */
@Controller
public class NullController {
    @RequestMapping("null")
    public String nullDemo(Model model) {
        model.addAttribute("myName", "");
        return "null";
    }
}
