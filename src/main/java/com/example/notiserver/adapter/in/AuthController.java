package com.example.notiserver.adapter.in;


import com.example.notiserver.dto.request.JoinDTO;
import com.example.notiserver.port.in.AuthUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthUseCase authUseCase;

    @PostMapping("/sign-up")
    //회원가입
    public void signUp(@RequestBody JoinDTO joinDTO){
        authUseCase.signUp(joinDTO);
    }


    @PostMapping("/accesstoken")
    //엑세스토큰 재발급
    public void generateNewAccessToken(@RequestHeader(value = "AuthorizationRefresh") String refreshToken){
        authUseCase.generateNewAccessToken(refreshToken);
    }

}
