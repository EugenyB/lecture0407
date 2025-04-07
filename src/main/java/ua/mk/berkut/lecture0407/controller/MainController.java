package ua.mk.berkut.lecture0407.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.mk.berkut.lecture0407.service.CalcService;

@Controller
@RequestMapping("/students")
@AllArgsConstructor
public class MainController {

    private CalcService calcService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/calc")
    public String calc(@RequestParam Integer num1, @RequestParam Integer num2, Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        Integer sum = calcService.calc(num1, num2);
        model.addAttribute("sum", sum);
        return "calc";
    }
}
