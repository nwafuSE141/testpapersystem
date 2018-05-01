package edu.nwafu.testpapersystem.service;


import edu.nwafu.testpapersystem.Base.BaseService;
import edu.nwafu.testpapersystem.domain.entity.FileUpload;

public interface FileUploadService extends BaseService<FileUpload,Integer> {

    FileUpload selectFileUploadByFileName(String fileName);

}
