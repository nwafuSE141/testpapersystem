package edu.nwafu.testpapersystem.Base;

import org.springframework.stereotype.Component;

@Component
public interface BaseMapper<T,ID extends Integer> {
    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}
