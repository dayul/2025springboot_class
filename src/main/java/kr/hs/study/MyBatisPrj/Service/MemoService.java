package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.Dto.MemoDto;

import java.util.List;

public interface MemoService {
    // CRUD : 삽입, 조회, 수정, 삭제

    // 1. insert
    public void insert(MemoDto memoDto);
    // 2. update
    public void update(MemoDto memoDto);
    // 3. delete
    public void delete(int idx);

    // 4. select
    public List<MemoDto> listAll();

    // findOne
    public MemoDto selectOne(int idx);
}
