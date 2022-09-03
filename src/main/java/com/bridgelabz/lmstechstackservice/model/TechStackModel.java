package com.bridgelabz.lmstechstackservice.model;

import com.bridgelabz.lmstechstackservice.dto.TechStackDto;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/*
 * Purpose : TechStackModel Are Used  Transfer the Data into Database
 * Version : 1.0
 * @author : Aviligonda Sreenivasulu
 * */
@Entity
@Table(name = "techstack")
@Data
public class TechStackModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long techId;
    private String imagePath;
    private boolean status;
    private String techName;
    private Long AdminId;
    private LocalDateTime creatorStamp;
    private LocalDateTime updateTimeStamp;

    public TechStackModel(TechStackDto techStackDto) {
        this.imagePath = techStackDto.getImagePath();
        this.status = techStackDto.isStatus();
        this.techName = techStackDto.getTechName();
    }

    public TechStackModel() {

    }
}
