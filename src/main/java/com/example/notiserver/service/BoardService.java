package com.example.notiserver.service;

import com.example.notiserver.dto.request.CreateBoardDTO;
import com.example.notiserver.dto.request.CreateCommentDTO;
import com.example.notiserver.entity.Board;
import com.example.notiserver.entity.Comment;
import com.example.notiserver.port.in.BoardUseCase;
import com.example.notiserver.port.in.CommentUseCase;
import com.example.notiserver.port.out.BoardRepository;
import com.example.notiserver.port.out.CommentRepository;
import com.example.notiserver.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService implements BoardUseCase, CommentUseCase {
    private final UserRepository userRepository;
    private final BoardRepository boardRepository;
    private final CommentRepository commentRepository;

    @Override
    public void getAllBoard() {
        boardRepository.findAll();
    }

    @Override
    public void getBoard(Long boardId) {
        boardRepository.findById(boardId);
        commentRepository.findAll();
    }

    @Override
    public void createBoard(CreateBoardDTO createBoardDTO) {
        Board board = new Board();
        boardRepository.save(board);

    }

    @Override
    public void createComment(CreateCommentDTO createCommentDTO) {
        Comment comment = new Comment();
        commentRepository.save(comment);

    }
}
