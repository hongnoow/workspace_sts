package com.green.Board.controller;

import com.green.Board.service.BoardServiceImpl;
import com.green.Board.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Parameter;
import java.util.List;

@Controller
public class BoardController {
    @Resource(name = "boardService")
    private BoardServiceImpl boardService;

    //게시글 목록
    @GetMapping("/")
    public String selectBoardList(Model model){
        List<BoardVO> list = boardService.selectBoardList();
        model.addAttribute("boardList", list);
        return "board_list";
    }
    @GetMapping("/writeBoard")
    public String writeBoard(){
        return "board_write_form";
    }

    @PostMapping("/boardReg")
    public String insertBoard(BoardVO boardVO){
        boardService.insert(boardVO);
        return "redirect:/";
    }
    @GetMapping("/boardDetail")
    public String boardDetail(@RequestParam (name = "boardNum") int boardNum, Model model){
        BoardVO board = boardService.selectBoardDetail(boardNum);
        model.addAttribute("boardInfo", board);
        return "board_detail";
    }
    @GetMapping("/goUpdate")
    public String goUpdate(@RequestParam (name = "boardNum") int boardNum, Model model){
        BoardVO board = boardService.selectBoardDetail(boardNum);
        model.addAttribute("boardInfo", board);
        return "update_form";
    }
    @GetMapping("/deleteBoard")
        public String deleteBoard(@RequestParam(name = "boardNum") int boardNum){
            boardService.deleteBoard(boardNum);
            return "redirect:/";

    }
    @PostMapping("/updateBoard")
        public String updateBoard(BoardVO boardVO) {
        boardService.updateBoard(boardVO);
            return "redirect:/boardDetail?boardNum=" + boardVO.getBoardNum();
    }

}
