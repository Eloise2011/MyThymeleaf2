package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-07 05:53
 */
@Controller
public class BooleanController {
    @RequestMapping("bool")
    public String boolDemo(Model model) {
        model.addAttribute("age", 18);
        model.addAttribute("married", true);
        return "bool";
    }
}
