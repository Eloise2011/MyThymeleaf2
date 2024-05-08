package elo.pra.controller;

import elo.pra.vo.Colleagues;
import elo.pra.vo.School;
import elo.pra.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-08 09:15
 */
@Controller
public class EachController {
    @GetMapping("/each")
    public String eachDemo(Model model) {
        //演示th:each处理list
        ArrayList<School> schools = new ArrayList<>();
        schools.add(new School("清华","北京五道口"));
        schools.add(new School("北大","北京海淀区"));
        schools.add(new School("复旦","上海"));
        schools.add(new School("武大","武汉珞珈山"));
        schools.add(new School("华中","武汉洪山区"));
        model.addAttribute("schoolList",schools);
        //演示th:each处理map
        HashMap<String, Student> stuMap = new HashMap<>();
        //public Student(Integer id, String name, String email, Integer age, String gender, School school) {
        stuMap.put("1",new Student(1,"刘备","163@163.com",58,"Male",new School("清华","北京五道口")));
        stuMap.put("2",new Student(2,"关羽","164@163.com",58,"Female",new School("北大","北京海淀区")));
        stuMap.put("3",new Student(3,"张飞","165@163.com",58,"NotKnown",new School("武大","武汉珞珈山")));
        model.addAttribute("stuMap",stuMap);

        //演示th:each处理List<Map>
        HashMap<String, Colleagues> map = new HashMap<>();
        List<Map<String, Colleagues>> listMap = new ArrayList<>();
        map.put("1",new Colleagues(1,"孙悟空","163@163.com"));
        map.put("2",new Colleagues(2,"猪八戒","164@163.com"));
        map.put("3",new Colleagues(3,"唐僧","165@163.com"));
        listMap.add(map);
        map = new HashMap<>();
        map.put("1",new Colleagues(4,"白骨精","163@163.com"));
        map.put("2",new Colleagues(5,"蜘蛛精","164@163.com"));
        listMap.add(map);
        model.addAttribute("colListMap", listMap);
        //演示处理数组
        String[] books = {"西游记", "三国演习", "水浒传", "红楼梦"};
        model.addAttribute("myBooks", books);
        //演示给select组件添加元素
        //单选select
        HashMap<String, String> areaCode = new HashMap<>();
        areaCode.put("010", "北京");
        areaCode.put("021", "上海");
        areaCode.put("020", "广州");
        areaCode.put("027", "武汉");
        model.addAttribute("areaCode",areaCode);
        model.addAttribute("choice","北京");
        model.addAttribute("isMultiple",false);
        //多选select
        areaCode = new HashMap<>();
        areaCode.put("028","成都");
        areaCode.put("029","重庆");
        areaCode.put("0755","深圳");
        areaCode.put("0757","佛山");
        model.addAttribute("areaCode2",areaCode);
        model.addAttribute("choice2","成都,重庆");
        model.addAttribute("isMultiple2",true);
        return "each";
    }
}
