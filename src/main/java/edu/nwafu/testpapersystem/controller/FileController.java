package edu.nwafu.testpapersystem.controller;

import com.alibaba.fastjson.JSONObject;
import edu.nwafu.testpapersystem.domain.entity.FileUpload;
import edu.nwafu.testpapersystem.domain.entity.User;
import edu.nwafu.testpapersystem.service.FileUploadService;
import edu.nwafu.testpapersystem.service.UserService;
import edu.nwafu.testpapersystem.util.JsonHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private UserService userService;

    @Autowired
    private FileUploadService fileUploadService;

    @Value("${file.location}")
    private String filepath;

    /**
     * 文件上传
     * @param file
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("fileUpload")
    public JSONObject fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpSession session){
        String filename=file.getOriginalFilename();
        FileUpload fileUpload=fileUploadService.selectFileUploadByFileName(filename);
        if(fileUpload!=null){
            return JsonHandler.jsonFail("文件名已经存在，请重新上传");
        }
        try {
            upload(file.getBytes(),filepath,filename);
        } catch (Exception e) {
            e.printStackTrace();
            return  JsonHandler.jsonFail("上传解析失败");
        }
        fileUpload=new FileUpload();
        fileUpload.setCreateTime(new Date());
        fileUpload.setFileName(filename);
        fileUpload.setUserId(((User)session.getAttribute("user")).getId());
        fileUploadService.insertSelective(fileUpload);
        return JsonHandler.jsonSuccess("文件上传成功");
    }


    /**
     * 文件下载
     * @param filename
     * @return
     * @throws IOException
     */
    @RequestMapping("download")
    public ResponseEntity<InputStreamResource> download(String filename) throws IOException {

        FileSystemResource file = new FileSystemResource(filepath+filename);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getFilename()));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .contentLength(file.contentLength())
                    .contentType(MediaType.parseMediaType("application/octet-stream"))
                    .body(new InputStreamResource(file.getInputStream()));
    }



    public void upload(byte[] bytes,String path,String name){
        File file=new File(path);
        if (!file.exists()){
            file.mkdir();
        }
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(path+name);
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
