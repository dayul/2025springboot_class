package kr.hs.study.MyBatisPrj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class T_TableController {

    @GetMapping("/t_table")
    public String T_TableController() {
        return "table_input";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num") int num, Model model) {

        String result = "";
        for(int i = 1; i <= 9; i++) {
            result += num + " x " + i + " = " + num * i + "<br/>";
        }

        model.addAttribute("list", result);
//        model.addAttribute("list", result.replaceAll("\\r?\\n", "<br/>"));
        return "table_result";
    }
}
