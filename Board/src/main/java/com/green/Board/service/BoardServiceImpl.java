package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public int insert(BoardVO boardVO) {
        int result = sqlSession.insert("insertBoard", boardVO);
        return 0;
    }

    @Override
    public List<BoardVO> selectBoardList() {
        return sqlSession.selectList("selectBoardList");
    }

    @Override
    public BoardVO selectBoardDetail(int boardNum) {
        return sqlSession.selectOne("selectBoardDetail", boardNum);
    }

    @Override
    public int deleteBoard(int boardNum) {
        return sqlSession.delete("deleteBoard", boardNum);
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        sqlSession.update("updateBoard", boardVO);

    }
}
