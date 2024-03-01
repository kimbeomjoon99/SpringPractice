package com.practice.spring.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponceDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponceDto dto = new HelloResponceDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}
