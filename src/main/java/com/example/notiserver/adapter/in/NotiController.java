package com.example.notiserver.adapter.in;

import com.example.notiserver.dto.request.SendNotiToDTO;
import com.example.notiserver.port.in.RealTimeNotiUseCase;
import com.example.notiserver.port.in.RegularNotiUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotiController {
    private final RegularNotiUseCase regularNotiUseCase;
    private final RealTimeNotiUseCase realTimeNotiUseCase;

    @PostMapping("/all")
    //모든유저에게 알림
    public void sendNotiToAll(@RequestBody SendNotiToDTO sendNotiToAllDTO){
        regularNotiUseCase.sendNotiToAll(sendNotiToAllDTO);
    }


    @PostMapping("/15andover")
    //나이가 15세 이상인 모든 유저에게 알림
    public void sendNotiTo15AndOver(@RequestBody SendNotiToDTO sendNotiToAllDTO){
        regularNotiUseCase.sendNotiTo15AndOver(sendNotiToAllDTO);
    }


    @PostMapping("/todayWriter")
    //오늘 (0시00분~) 안에 게시글을 작성한 모든 유저에게 알림
    public void sendNotiToWhoPostedToday(@RequestBody SendNotiToDTO sendNotiToAllDTO){
        regularNotiUseCase.sendNotiToWhoPostedToday(sendNotiToAllDTO);
    }

}