package com.myproject.callabo_user_boot.creator.dto;

import lombok.*;

@Data
public class CreatorListDTO {

    private String creatorId;

    private String creatorName;

    private String backgroundImg;

    private String logoImg;

    private Boolean followStatus;

    private Long followerCount;
}
