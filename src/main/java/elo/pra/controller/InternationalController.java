package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 15:46
 */
@Controller
public class InternationalController {
    @RequestMapping("/i18N")
    public String i18n(Model model) {
        //model.addAttribute("login", "乔叔华");
        return "i18n";
    }
}
