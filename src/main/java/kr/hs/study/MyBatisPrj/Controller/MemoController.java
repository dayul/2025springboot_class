package kr.hs.study.MyBatisPrj.Controller;

import org.springframework.ui.Model;
import kr.hs.study.MyBatisPrj.Dao.MemoDao;
import kr.hs.study.MyBatisPrj.Dto.MemoDto;
import kr.hs.study.MyBatisPrj.Service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {

    // 호출하기 위해 !
    // boot가 컨테이너에서 memoservice 타입을 보고 찾음
    @Autowired
    private MemoService memoService;

    @GetMapping("/memo")
    public String memoController(Model model) {
        List<MemoDto> allLlist = memoService.listAll();
        model.addAttribute("data", allLlist);
        return "memo";
    }

    @PostMapping("/write_done")
    public String insert(MemoDto memoDto) {
        memoService.insert(memoDto);
        return "redirect:/memo";
    }

}
