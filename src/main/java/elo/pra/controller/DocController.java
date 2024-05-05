package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 00:21
 */
@Controller
public class DocController {
    @RequestMapping("/doc")
    public String doc() {
        return "/doc/index";
    }
}
