package kr.hs.study.MyBatisPrj.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemoDto {
    private int idx;
    private String writer;
    private String memo;
    private LocalDateTime post_date;
}
