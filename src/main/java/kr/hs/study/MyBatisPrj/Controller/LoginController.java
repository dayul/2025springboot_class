package kr.hs.study.MyBatisPrj.Controller;

import kr.hs.study.MyBatisPrj.Dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginTest(@ModelAttribute LoginDto loginDto, Model model) {
        if(loginDto.getEmail().equals("dayul") && loginDto.getPw().equals("3955")) {
            model.addAttribute("result", "로그인 성공!");
            return "login_result";
        }

        model.addAttribute("result", "로그인 실패");
        model.addAttribute("failed", "실패");
        return "login_result";
    }
}
