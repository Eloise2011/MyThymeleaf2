package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-07 06:40
 */
@Controller
public class TernaryController {
    @GetMapping("ternary")
    public String ternaryDemo(Model model) {
        model.addAttribute("name", "ternary operator Demo");
        model.addAttribute("age", 18);
        model.addAttribute("address", "上海");
        model.addAttribute("islogin", false);
        model.addAttribute("isMember", false);
        return "TernaryOperator";
    }
}
