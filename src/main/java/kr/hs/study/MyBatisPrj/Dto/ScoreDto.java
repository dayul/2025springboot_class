package kr.hs.study.MyBatisPrj.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;

@Data
public class ScoreDto {
    private String name;
    private int kor;
    private int eng;
    private int math;
}
