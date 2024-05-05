package elo.pra.controller;

import elo.pra.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 10:40
 */
@Controller
public class LinkController {
    @RequestMapping("/link/var/test")
    public String linkTest(Model model) {
        model.addAttribute("queryStudent", "/query/student");
        return "link";
    }

    @RequestMapping("/link/query")
    public String linkQuery(Model model) {
        model.addAttribute("queryStudent", "/query/student");
        model.addAttribute("id", 1);
        model.addAttribute("name", "老王");
        return "link";
    }

    @RequestMapping("/link/query/{id}/{name}")
    public String linkQueried(Model model, @PathVariable Integer id, @PathVariable String name) {
        Student student = new Student();
        if("1".equals(String.valueOf(id)) && "老王".equals(name)){
            student.setId(id);
            student.setName(name);
        }
        model.addAttribute("student", student);
        return "var1";
    }
}
