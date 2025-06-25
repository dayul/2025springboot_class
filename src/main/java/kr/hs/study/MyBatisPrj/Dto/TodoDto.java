package kr.hs.study.MyBatisPrj.Dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class TodoDto {
    private int idx;
    private String content;
    private String password;
    private char status;
    private LocalDateTime postDate;

//    private Boolean open;       // 체크 여부
}
