package com.green.FetchStudent.Servicce;

import com.green.FetchStudent.VO.ClassVO;
import com.green.FetchStudent.VO.ScoreVO;
import com.green.FetchStudent.VO.StuVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuService {

    List<StuVO> selectStuList();

    List<ClassVO> selectClassList();

    List<StuVO> selectStuList2();

    List<StuVO> selectStuList3(StuVO stuVO);

    //학생 상세 정보 조회
    StuVO selectStuDetail(int stuNum);

    //점수 정보 조회
    ScoreVO selectScoreInfo(int stuNum);

    void insertScore(ScoreVO scoreVO);
}
