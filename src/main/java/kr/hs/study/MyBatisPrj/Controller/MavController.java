package kr.hs.study.MyBatisPrj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MavController {

    @GetMapping("/mav")
    public ModelAndView mavController() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("item", "lay Devine");
        mv.setViewName("mav_result");

        return mv;
    }
}
