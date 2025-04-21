package kr.hs.study.MyBatisPrj.Dao;

import kr.hs.study.MyBatisPrj.Dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface MemoDao {
    // CRUD : 삽입, 조회, 수정, 삭제

    // 1. insert
    public void insert(MemoDto memoDto);
    // 2. update
    public void update(int idx);
    // 3. delete
    public void delete(int idx);

    // 4. select
    public List<MemoDto> listAll();
}
