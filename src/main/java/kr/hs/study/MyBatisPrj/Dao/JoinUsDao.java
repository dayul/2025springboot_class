package kr.hs.study.MyBatisPrj.Dao;

import kr.hs.study.MyBatisPrj.Dto.JoinUsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinUsDao {
    public void createUser(JoinUsDto joinUsDto);
}
