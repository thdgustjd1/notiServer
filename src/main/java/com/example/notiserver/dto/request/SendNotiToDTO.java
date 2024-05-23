package com.example.notiserver.dto.request;

import com.example.notiserver.entity.NotiMethod;
import lombok.Getter;

import java.util.List;

@Getter
public class SendNotiToDTO {
    String content;
    List<NotiMethod>methods;
}
