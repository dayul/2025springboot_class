package kr.hs.study.MyBatisPrj.Dto;

import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
public class LoginDto {
    private String email;
    private String pw;
}
