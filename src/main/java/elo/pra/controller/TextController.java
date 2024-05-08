package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-06 02:13
 */
@Controller
public class TextController {
    @RequestMapping("/text")
    public String textDemo(Model model) {
        model.addAttribute("info", "语言是Java 和 go");
        model.addAttribute("n1","张三");
        model.addAttribute("n2","李四");
        return "text";
    }
}
