package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.Dao.TodoDao;
import kr.hs.study.MyBatisPrj.Dto.TodoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    TodoDao todoDao;

    @Override
    public void insert(TodoDto todoDto) {
        todoDao.insert(todoDto);
    }

    @Override
    public List<TodoDto> selectAll() {
        return todoDao.selectAll();
    }

    @Override
    public TodoDto selectOne(int idx) {
        return todoDao.selectOne(idx);
    }

    @Override
    public void delete(int idx) {
        todoDao.delete(idx);
    }

    @Override
    public void update(TodoDto todoDto) {
        todoDao.update(todoDto);
    }
}
