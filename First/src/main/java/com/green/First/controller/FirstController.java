package com.green.First.controller;

import com.green.First.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("main")
    public String main(){
        return "first";
    }
    //@RequestParam html에서 넘어 오는 데이터를 받을 때 사용
    //name : 넘어 오는 데이터의 이름
    @GetMapping("second")
    public String second(@RequestParam(name = "name") String name
                ,@RequestParam(name = "age") int age) {
        System.out.println("이름 " + name);
        System.out.println("나이 " + age);
        return "abc";
    }
    //넘어 오는 데이터의 이름과 동일한 변수를 가진
    //클래스 객체로 데이터를 받을 수 있다.
    @GetMapping("third")
    public String third(MemberVO memberVO, Model model){
        System.out.println(memberVO);

        //데이터를 html로 전달
        model.addAttribute("score", 80);
        return "abc";
    }
}