package com.example.notiserver.port.in;

import com.example.notiserver.dto.request.SendNotiToDTO;

public interface RegularNotiUseCase {
    //모든유저에게 알림 (알림내용, 유형(리스트))
    public void sendNotiToAll(SendNotiToDTO sendNotiToAllDTO);

    //나이가 15세 이상인 모든 유저에게 알림
    public void sendNotiTo15AndOver(SendNotiToDTO sendNotiToAllDTO);

    //오늘 (0시00분~) 안에 게시글을 작성한 모든 유저에게 알림
    public void sendNotiToWhoPostedToday(SendNotiToDTO sendNotiToAllDTO);

}
