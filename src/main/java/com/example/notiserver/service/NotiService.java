package com.example.notiserver.service;

import com.example.notiserver.dto.request.SendNotiToDTO;
import com.example.notiserver.entity.SentNoti;
import com.example.notiserver.port.in.RealTimeNotiUseCase;
import com.example.notiserver.port.in.RegularNotiUseCase;
import com.example.notiserver.port.out.BoardRepository;
import com.example.notiserver.port.out.SentNotiRepository;
import com.example.notiserver.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotiService implements RegularNotiUseCase, RealTimeNotiUseCase {
    private final UserRepository userRepository;
    private final SentNotiRepository sentNotiRepository;
    private final BoardRepository boardRepository;
    @Override
    public void sendNotiToAll(SendNotiToDTO sendNotiToAllDTO) {
        userRepository.findAll();
        SentNoti sentNoti = new SentNoti();
        sentNotiRepository.save(sentNoti);
        //모두에게 알림보내는 로직
    }

    @Override
    public void sendNotiTo15AndOver(SendNotiToDTO sendNotiToAllDTO) {
        userRepository.findAll();
        SentNoti sentNoti = new SentNoti();
        sentNotiRepository.save(sentNoti);
        //15세 이상에게 알림보내는 로직
    }

    @Override
    public void sendNotiToWhoPostedToday(SendNotiToDTO sendNotiToAllDTO) {
        boardRepository.findAll();
        SentNoti sentNoti = new SentNoti();
        sentNotiRepository.save(sentNoti);
        //오늘 게시글을 작성한 유저에게 알림보내는 로직
    }
}
