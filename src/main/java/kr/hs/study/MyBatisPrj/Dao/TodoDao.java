package kr.hs.study.MyBatisPrj.Dao;

import kr.hs.study.MyBatisPrj.Dto.TodoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDao {
    public void insert(TodoDto todoDto);
    public List<TodoDto> selectAll();
    public TodoDto selectOne(int idx);
    public void delete(int idx);
    public void update(TodoDto todoDto);
}
