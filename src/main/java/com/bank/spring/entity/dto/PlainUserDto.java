package com.bank.spring.entity.dto;

import com.bank.spring.entity.User;
import lombok.Data;

@Data
public class PlainUserDto {

    private Long id;
    private String name;

    public static PlainUserDto from(User user){
        PlainUserDto plainUserDto = new PlainUserDto();
        plainUserDto.setId(user.getId());
        plainUserDto.setName(user.getFirstName() + " " + user.getLastName());
        return plainUserDto;
    }
}
