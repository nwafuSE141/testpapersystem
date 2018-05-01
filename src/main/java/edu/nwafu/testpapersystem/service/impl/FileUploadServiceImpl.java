package edu.nwafu.testpapersystem.service.impl;

import edu.nwafu.testpapersystem.Base.BaseMapper;
import edu.nwafu.testpapersystem.Base.Impl.BaseServiceImpl;
import edu.nwafu.testpapersystem.domain.entity.FileUpload;
import edu.nwafu.testpapersystem.domain.mapper.FileUploadMapper;
import edu.nwafu.testpapersystem.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadServiceImpl extends BaseServiceImpl<FileUpload,Integer> implements FileUploadService {

    @Autowired
    private FileUploadMapper fileUploadMapper;

    @Override
    public BaseMapper<FileUpload, Integer> getBaseMapper() {
        return fileUploadMapper;
    }

    @Override
    public FileUpload selectFileUploadByFileName(String fileName) {
        return fileUploadMapper.selectFileUploadByFileName(fileName);
    }
}
