package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.Dao.JoinUsDao;
import kr.hs.study.MyBatisPrj.Dto.JoinUsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinUsServiceImpl implements JoinUsService {
    @Autowired
    private JoinUsDao joinUsDao;

    @Override
    public void createUser(JoinUsDto joinUsDto) {
        joinUsDao.createUser(joinUsDto);
    }
}
