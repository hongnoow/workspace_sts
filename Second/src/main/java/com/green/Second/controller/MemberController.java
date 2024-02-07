package com.green.Second.controller;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


//@controller : 해당 클래스 파일이 컨트롤러 역할을 하는
//클래스임을 spring에서 인식!
@Controller
public class MemberController {
    //GetMapping, @PostMapping
    //페이지 접속 번호
    //소괄호 안의 글자와 localhost:8081 뒤의 글자가 일치 하면
    //해당 메소드를 실행
    //@PostMapping운 페이지 이동 방법 중에
    //form 태그로 이동 하면서 form 태그의 method 속성 값이
    //post일 때만 실행됨.
    //get방식
    //1. form 태그의 method 속성 값이 get일 때
    //2. a 태그로 페이지가 이동 될 때
    //3. 주소창에 직접 url을 입력 했을 때

    @GetMapping("/")
    public String main(){
        //리턴되는 문자열은 마지막에 실행 되는 html 파일명을 의미
        //html 파일은 반드시 templates 폴더 안에 존재
        return "first";//first.html 실행
    }
    //@RequestParam 어노테이션으로 html에서 넘어 오는 데이터를 전달
    //해당 어노테이션의 속성으로는 name, required, defaultValue가 있음
    //name : html에서 넘어 오는 데이터의 이름
    //required : 넘어 오는 데이터가 필수 데이터인지 설정
    //required 속성을 적지 않으면 defualt 값은 true
    //defaultValue : 데이터가 넘어 오지 않은 때 설정 되는 기본값

    //html로 데이터를 전달 하기 위해서는
    //메소드의 매개변수로 Model(interface)의 객체를 선언
    @GetMapping("/second")
    public String second(@RequestParam(name = "addr", required = false) String address,
                         @RequestParam(name = "age", required = false, defaultValue = "1") int age
                         , Model model){
        //addr 넘어온 데이터 이름
        //address 새로운 변수에 addr 데이터 할당
        System.out.println("addr = " + address);
        System.out.println("age = " + age);

        //html로 데이터 전달 하기
        model.addAttribute("addr", address);
        model.addAttribute("age", age);
        model.addAttribute("name",  "홍길동");
        return "second";
    }

}
