package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Joshua.H.Brooks
 * @description 演示th:text & th:utext设置标签的区别
 * @date 2024-05-08 08:20
 */
@Controller
public class BodyController {
    @GetMapping("body/text")
    public String textDemo(Model model) {
        model.addAttribute("info", "语言是<b>Java</b> 和 <b>go</b>");
        model.addAttribute("interest", "兴趣是<b>Dance</b> 和 <b>Music</b>");
        return "body";
    }
}
