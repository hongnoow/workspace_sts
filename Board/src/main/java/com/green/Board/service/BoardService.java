package com.green.Board.service;

import com.green.Board.vo.BoardVO;

import java.util.List;

public interface BoardService {
    //게시글 등록
    int insert(BoardVO boardVO);

    //게시글 목록

    List<BoardVO> selectBoardList();

    BoardVO selectBoardDetail(int boardNum);

    int deleteBoard(int boardNum);

    void updateBoard(BoardVO boardVO);
}
