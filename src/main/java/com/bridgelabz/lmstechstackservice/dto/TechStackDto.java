package com.bridgelabz.lmstechstackservice.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/*
 * Purpose : TechStackDto fields are Used to Create and Update TechStack Details
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */
@Data
public class TechStackDto {
    @NotNull(message = "imagePath can't be null")
    private String imagePath;
    @NotNull(message = "status can't be null")
    private boolean status;
    @NotNull(message = "techName can't be null")
    private String techName;
}
