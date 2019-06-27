package com.techcourse.myblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PageController {
    //    @GetMapping("/articles")
//    public String index(){
//        return "Ok!";
//    }
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/articles1")
    public String index() {
        return "rmtest";
    }

    @GetMapping("/articles2")//parameter test
    public String index(@RequestParam(name = "par", required = false, defaultValue = "articles") String name1, Model model) {
        model.addAttribute("par", name1);
        return "rmtest";
    }

    @RequestMapping("/articles")
    public String articles() {
        return "redirect:/index.html";
    }

    @RequestMapping("/writing")
    public String writing() {
        return "redirect:/article-edit.html";
    }

    @GetMapping(value={"","/","nameTest"})
    public String blogName(@RequestParam(name = "blogName", required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("blogName", name);
        return "index";
    }
}