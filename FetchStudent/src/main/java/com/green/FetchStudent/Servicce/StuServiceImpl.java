package com.green.FetchStudent.Servicce;

import com.green.FetchStudent.VO.ClassVO;
import com.green.FetchStudent.VO.ScoreVO;
import com.green.FetchStudent.VO.StuVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuService")
public class StuServiceImpl implements StuService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<StuVO> selectStuList() {
        List<StuVO> stuList = sqlSession.selectList("selectStuList");
        return stuList;
    }

    @Override
    public List<ClassVO> selectClassList() {
        List<ClassVO> classList = sqlSession.selectList("selectClassList");
        return classList;
    }

    @Override
    public List<StuVO> selectStuList2() {
        return sqlSession.selectList("selectStuList2");
    }

    @Override
    public List<StuVO> selectStuList3(StuVO stuVO) {
        return sqlSession.selectList("selectStuList3", stuVO);
    }

    @Override
    public StuVO selectStuDetail(int stuNum) {
        return sqlSession.selectOne("selectStuDetail", stuNum);
    }

    @Override
    public ScoreVO selectScoreInfo(int stuNum) {
        return sqlSession.selectOne("selectScoreInfo", stuNum);
    }

    @Override
    public void insertScore(ScoreVO scoreVO) {
        sqlSession.insert("insertScore", scoreVO);
    }
}
