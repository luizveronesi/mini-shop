package com.example.project.domain.request;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UploadRequest {

    private Integer id;

    private String folder;
    
    private MultipartFile file;
}