package com.example.notiserver.service;

import com.example.notiserver.dto.request.JoinDTO;
import com.example.notiserver.port.in.AuthUseCase;
import com.example.notiserver.port.out.RefreshTokenRepository;
import com.example.notiserver.port.out.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService implements AuthUseCase {

    private final UserRepository userRepository;
    private final RefreshTokenRepository refreshTokenRepository;
    @Override
    public void signUp(JoinDTO joinDTO){
        userRepository.existsByEmailAddress(joinDTO.getEmailAddress());
    }

    @Override
    public void generateNewAccessToken(String refreshToken) {
        refreshTokenRepository.findById(refreshToken);
    }

}
