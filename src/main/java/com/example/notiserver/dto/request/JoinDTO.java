package com.example.notiserver.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDTO {
    private String username;
    private String password;
    private String emailAddress;
}
