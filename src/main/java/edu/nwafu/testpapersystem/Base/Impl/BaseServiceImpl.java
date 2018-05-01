package edu.nwafu.testpapersystem.Base.Impl;


import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.BaseService;

public abstract class BaseServiceImpl<T,ID extends Integer> implements BaseService<T,ID> {

    public  abstract BaseMapper<T,ID> getBaseMapper();


    @Override
    public int deleteByPrimaryKey(ID id) {
        return getBaseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record) {
        return getBaseMapper().insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return getBaseMapper().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return getBaseMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return getBaseMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return getBaseMapper().updateByPrimaryKey(record);
    }
}
