package kr.hs.study.MyBatisPrj.Controller;

import kr.hs.study.MyBatisPrj.Dto.ScoreDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/score")
    public String scoreController() {
        return "score_input";
    }

    @PostMapping("/score")
    public String score(@ModelAttribute ScoreDto scoreDto, Model model) {
        int sum = scoreDto.getKor() + scoreDto.getEng() + scoreDto.getMath();
        String avg = String.format("%.2f", (double) (sum) / 3);

        model.addAttribute("name", "이름 : " + scoreDto.getName());
        model.addAttribute("kor", "국어 : " + scoreDto.getKor());
        model.addAttribute("eng", "영어 : " +  scoreDto.getEng());
        model.addAttribute("math", "수학 : " + scoreDto.getMath());
        model.addAttribute("sum", "총합 : " + sum);
        model.addAttribute("avg", "평균 : " + avg);

//        model.addAttribute("dto", scoreDto);

        return "score_result";
    }
}
