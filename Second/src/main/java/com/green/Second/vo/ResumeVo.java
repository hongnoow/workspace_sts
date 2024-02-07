package com.green.Second.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@Setter
@ToString
public class ResumeVo {
    private String name;
    private String tel;
    private String grade;
    private String schoolName;
    private String type;
    private String certiName;
    private String certiDate;
    private String certiAt;
    private String company;
    private String job;
    private int year;
    private int month;
    private String intro;

}
