package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private String name;
    private String role;

}
