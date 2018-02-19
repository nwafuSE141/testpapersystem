package edu.nwafu.testpapersystem.domain.dao;

import edu.nwafu.testpapersystem.domain.entity.QuesAndAns;
import java.util.List;

public interface QuesAndAnsMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(QuesAndAns record);

    
    QuesAndAns selectByPrimaryKey(Integer id);

    
    List<QuesAndAns> selectAll();

    
    int updateByPrimaryKey(QuesAndAns record);
}