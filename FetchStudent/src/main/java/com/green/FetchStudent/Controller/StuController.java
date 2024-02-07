package com.green.FetchStudent.Controller;

import com.green.FetchStudent.Servicce.StuServiceImpl;
import com.green.FetchStudent.VO.ClassVO;
import com.green.FetchStudent.VO.DetailVO;
import com.green.FetchStudent.VO.ScoreVO;
import com.green.FetchStudent.VO.StuVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StuController {
    @Resource(name = "stuService")
    private StuServiceImpl stuService;
    @GetMapping("/")
    public String selectStuList(StuVO stuVO, Model model) {
        List<ClassVO> classList = stuService.selectClassList();
//        List<StuVO> stuList = stuService.selectStuList2();
        List<StuVO> selectStuList = stuService.selectStuList3(stuVO);
//        model.addAttribute("stuList", stuList);
        model.addAttribute("classList", classList);
        model.addAttribute("stuList", selectStuList);

        return "stu_manage";
    }
    @ResponseBody
    @PostMapping("/fetchSelect")
    public List<StuVO> fetchSelect(StuVO stuVO){
        List<StuVO> stuList = stuService.selectStuList3(stuVO);
        return stuList;
    }

    @ResponseBody
    @PostMapping("/detail")
    public DetailVO detail(@RequestParam(name = "stuNum") int stuNum, ScoreVO scoreVO){
        //클릭한 학생의 상세 정보 조회
        StuVO stuInfo = stuService.selectStuDetail(stuNum);

        //클릭한 학생의 점수 정보 조회
        ScoreVO scoreInfo = stuService.selectScoreInfo(stuNum);



        DetailVO result = new DetailVO();
        result.setStuVO(stuInfo);
        result.setScoreVO(scoreInfo);

        return result;
        //조회 한 데이터를 가지고 자바스크립트로 이동
    }

    @ResponseBody
    @PostMapping("/insertScore")
    public void insertScore(ScoreVO scoreVO){
        stuService.insertScore(scoreVO);
    }
}
