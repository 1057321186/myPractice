package com.pojo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StudentDTO implements Serializable {
    private String name;

    private Integer age;
}
