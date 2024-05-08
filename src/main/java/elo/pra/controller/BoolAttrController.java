package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @author Joshua.H.Brooks
 * @description 演示布尔属性赋值的情况
 * @date 2024-05-07 09:26
 */
@Controller
public class BoolAttrController {
    @RequestMapping("boolAtt")
    public String boolAttrDemo(Model model) {
        model.addAttribute("selected", "true");
        model.addAttribute("unselected", "false");
        ArrayList<String> types = new ArrayList<String>();
        types.add("自由泳");
        types.add("蛙泳");
        types.add("仰泳");
        types.add("狗刨式");
        types.add("闭气式");
        model.addAttribute("types", types);
        return "boolAttr";
    }
}
