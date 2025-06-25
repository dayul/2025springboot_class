package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.Dto.TodoDto;

import java.util.List;

public interface TodoService {
    public void insert(TodoDto todoDto);
    public List<TodoDto> selectAll();
    public TodoDto selectOne(int idx);
    public void delete(int idx);
    public void update(TodoDto todoDto);
}
