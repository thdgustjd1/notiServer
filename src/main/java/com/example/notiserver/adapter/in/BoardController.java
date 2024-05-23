package com.example.notiserver.adapter.in;

import com.example.notiserver.dto.request.CreateBoardDTO;
import com.example.notiserver.dto.request.CreateCommentDTO;
import com.example.notiserver.port.in.BoardUseCase;
import com.example.notiserver.port.in.CommentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardUseCase boardUseCase;
    private final CommentUseCase commentUseCase;

    @GetMapping()
    //모든 글 리스트
    public void getAllBoard(){
        boardUseCase.getAllBoard();
    }

    @GetMapping("/{boardId}")
    //글 자세히보기
    public void getBoard(@PathVariable Long boardId){
        boardUseCase.getBoard(boardId);
    }

    @PostMapping()
    //글쓰기
    public void createBoard(@RequestBody CreateBoardDTO createBoardDTO){

        boardUseCase.createBoard(createBoardDTO);
    }

    @PostMapping("/comment")
    //코멘트 작성
    public void createComment(@RequestBody CreateCommentDTO createCommentDTO){
        commentUseCase.createComment(createCommentDTO);
    }
}
