package com.green.Second.controller;

import com.green.Second.vo.ResumeVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResumeController {

    @GetMapping("resume")
    public String main(){
        return "resume_reg";
    }
    @PostMapping("resume_2")
    public String resume_2(@RequestParam(name = "name") String name
                , @RequestParam(name = "tel") String tel, Model model){
        model.addAttribute("name", name);
        model.addAttribute("tel", tel);
        return "resume_info";
    }
    @PostMapping("resume_3")
    public String resume_3(ResumeVo resumeVo){
        System.out.println(resumeVo);
        return "";
    }
}
