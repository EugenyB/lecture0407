package ua.mk.berkut.lecture0407.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.mk.berkut.lecture0407.data.Student;
import ua.mk.berkut.lecture0407.service.CalcService;
import ua.mk.berkut.lecture0407.service.StudentService;

@Controller
@RequestMapping("/students")
@AllArgsConstructor
public class MainController {

    private CalcService calcService;
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello(Model model) {
//        model.addAttribute("color", color);
//        model.addAttribute("name", name);
        model.addAttribute("students", studentService.findAll());
        return "hello";
    }

    @PostMapping("/calc")
    public String calc(@RequestParam Integer num1, @RequestParam Integer num2, Model model) {

        model.addAttribute("result", calcService.calc(num1, num2));
        return "calc";
    }

    @PostMapping("/add")
    public String add(@RequestParam String name, @RequestParam Integer age) {
        //
        studentService.add(new Student(name, age));
        return "redirect:/students/hello";
    }
}
