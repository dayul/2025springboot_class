package kr.hs.study.MyBatisPrj.Controller;

import kr.hs.study.MyBatisPrj.Dto.TodoDto;
import kr.hs.study.MyBatisPrj.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    public String todoController(Model model) {
        List<TodoDto> allTodo =  todoService.selectAll();
        model.addAttribute("data", allTodo);
        return "todo";
    }

    // add todo
    @PostMapping("/addTodo")
    public String insertTodo(TodoDto todoDto) {
        todoService.insert(todoDto);
        return "redirect:/todo";
    }

    // TODO: password 받고 그 idx값의 비밀번호와 동일하면 수정, 삭제
    // TODO: 체크박스

    // update todo
    @GetMapping("/updateTodo/{idx}")
    public String editTodoForm(@PathVariable("idx") int idx, Model model) {
        TodoDto dto = todoService.selectOne(idx);
        model.addAttribute("todo", dto);
        return "todo_form";
    }

    // todo_form
    @PostMapping("updateTodo")
    public String updateTodo(TodoDto todoDto) {
        TodoDto savedDto = todoService.selectOne(todoDto.getIdx());
        if(savedDto.getPassword().equals(todoDto.getPassword())) {
            todoService.update(todoDto);
        }
        return "redirect:/todo";
    }

    // delete_todo
    @GetMapping("/finishedTodo/{idx}")
    public String deleteTodoForm(@PathVariable("idx") int idx, Model model) {
        model.addAttribute("idx", idx);
        return "todo_delete_form";
    }

    @PostMapping("/finishedTodo")
    public String deleteTodo(TodoDto todoDto) {
        System.out.println("비번 잘 들어왓우요" + todoDto);
        todoService.delete(todoDto.getIdx());
        return "redirect:/todo";
    }
}
