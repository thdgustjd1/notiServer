package com.example.notiserver.port.in;

import com.example.notiserver.dto.request.CreateCommentDTO;

public interface CommentUseCase {
    //코멘트 작성
    public void createComment(CreateCommentDTO createCommentDTO);

}
