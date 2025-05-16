package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.Dao.MemoDao;
import kr.hs.study.MyBatisPrj.Dto.MemoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoDao memoDao;

    @Override
    public void insert(MemoDto memoDto) {
        memoDao.insert(memoDto);
    }

    @Override
    public void update(MemoDto memoDto) {
        memoDao.update(memoDto);
    }

    @Override
    public void delete(int idx) {

    }

    @Override
    public List<MemoDto> listAll() {
//        List<MemoDto> all = memoDao.listAll();
        return memoDao.listAll();
    }

    @Override
    public MemoDto selectOne(int idx) {
        return memoDao.selectOne(idx);
    }
}
