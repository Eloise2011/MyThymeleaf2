package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-04 22:55
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello(Model model) {
        model.addAttribute("name","乔叔华");
        return "index";
    }

    @RequestMapping("hi")
    public String hi(Model model, HttpServletRequest request) {
        request.setAttribute("name","布鲁克斯-Josh");
        return "index";
    }
}
