package com.example.notiserver.service;

import com.example.notiserver.port.in.ManualNotiUseCase;
import com.example.notiserver.port.in.RealTimeNotiUseCase;
import com.example.notiserver.port.in.RegularNotiUseCase;
import org.springframework.stereotype.Service;

@Service
public class NotiService implements RegularNotiUseCase, RealTimeNotiUseCase, ManualNotiUseCase {

}
