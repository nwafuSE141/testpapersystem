package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.QuesAndAns;
import java.util.List;

public interface QuesAndAnsMapper extends BaseMapper<QuesAndAns,Integer> {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(QuesAndAns record);

    
    QuesAndAns selectByPrimaryKey(Integer id);

    
    List<QuesAndAns> selectAll();

    
    int updateByPrimaryKey(QuesAndAns record);
}