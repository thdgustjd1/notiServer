package com.example.notiserver.port.in;

import com.example.notiserver.dto.request.CreateBoardDTO;

public interface BoardUseCase {
    //모든 글 리스트
    public void getAllBoard();

    //글 자세히보기
    public void getBoard(Long boardId);

    //글쓰기
    public void createBoard(CreateBoardDTO createBoardDTO);

}
