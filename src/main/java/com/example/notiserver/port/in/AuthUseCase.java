package com.example.notiserver.port.in;

import com.example.notiserver.dto.request.JoinDTO;

public interface AuthUseCase {

    //회원가입
    public void signUp(JoinDTO joinDTO);

    //엑세스토큰 재발급
    public void generateNewAccessToken(String refreshToken);


}
