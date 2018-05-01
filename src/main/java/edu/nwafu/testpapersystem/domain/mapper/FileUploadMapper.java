package edu.nwafu.testpapersystem.domain.mapper;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.domain.entity.FileUpload;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface FileUploadMapper extends BaseMapper<FileUpload,Integer> {

    @Select("select * from file_upload where file_name=#{fileName}")
    @ResultMap("BaseResultMap")
    FileUpload selectFileUploadByFileName(String fileName);

}