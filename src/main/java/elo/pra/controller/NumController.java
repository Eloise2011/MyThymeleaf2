package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description 演示数字表达式的常见用法
 * @date 2024-05-06 02:45
 */
@Controller
public class NumController {
    @RequestMapping("/num")
    String numDemo(Model model) {
        model.addAttribute("n1",100);
        model.addAttribute("n2",30);
        return "num";
    }
}
