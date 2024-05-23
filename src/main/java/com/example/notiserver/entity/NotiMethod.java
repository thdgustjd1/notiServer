package com.example.notiserver.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NotiMethod {

    EMAIL("EMAIL")
    ,PUSH("PUSH");

    private final String value;
}
