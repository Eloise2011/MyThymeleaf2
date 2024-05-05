package elo.pra.controller;

import elo.pra.vo.School;
import elo.pra.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 00:02
 */
@Controller
public class ExpressionVarController {
    @RequestMapping("/expressionVar1")
    public String expressionVar1(Model model) {
        model.addAttribute("Nationality","China");
        model.addAttribute("VisaType","Student");
        Student student = new Student();
        student.setId(1);
        student.setName("乔叔华");
        student.setEmail("163@163.com");
        student.gender="Female";
        student.setAge(18);
        School school = new School();
        school.setName("清华大学");
        school.setAddress("北京五道口");
        student.setSchool(school);
        model.addAttribute("student",student);

        return "var1";
    }
}
