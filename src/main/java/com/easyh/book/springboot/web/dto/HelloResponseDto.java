package com.easyh.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//선언된 필드의 get 메소드 생성
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
