package kr.hs.study.MyBatisPrj.Controller;

import kr.hs.study.MyBatisPrj.Dto.JoinUsDto;
import kr.hs.study.MyBatisPrj.Service.JoinUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinUsController {

    @Autowired
    private JoinUsService joinUsService;

    @GetMapping("/joinus")
    public String joinUsController() {
        return "join_us";
    }

    @PostMapping("/join")
    public String createUser(JoinUsDto joinUsDto, Model model) {
        try {
            joinUsService.createUser(joinUsDto);
            model.addAttribute("result", "로그인 성공");
            return "join_us_result";

        } catch (Exception e) {
            model.addAttribute("failed", "실패");
            throw new RuntimeException(e);
        }
    }
}
