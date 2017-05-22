package com.zkn.learnspringboot.aop;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zkn
 */
@Component("fileUploadInterceptor")
@ConfigurationProperties(prefix = "fileupload")
public class FileUploadInterceptor extends HandlerInterceptorAdapter {

    private List<String> allowFileTypeList;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        //文件上传的Servlet
        if (request instanceof MultipartHttpServletRequest) {
            //允许所有的文件类型
            if (allowFileTypeList == null) {
                return super.preHandle(request, response, handler);
            }
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            Iterator<String> it = multipartRequest.getFileNames();
            if (it != null) {
                while (it.hasNext()) {
                    String fileParameter = it.next();
                    List<MultipartFile> listFile = multipartRequest.getFiles(fileParameter);
                    if (!CollectionUtils.isEmpty(listFile)) {
                        MultipartFile multipartFile = null;
                        String fileName = "";
                        for (int i = 0; i < listFile.size(); i++) {
                            multipartFile = listFile.get(i);
                            fileName = multipartFile.getOriginalFilename();
                            int flag = 0;
                            if ((flag = fileName.lastIndexOf(".")) > 0) {
                                fileName = fileName.substring(flag+1);
                            }
                            //不被允许的后缀名
                            if (!allowFileTypeList.contains(fileName)) {
                                this.outputStream(request, response);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return super.preHandle(request, response, handler);
    }

    private void outputStream(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding(request.getCharacterEncoding());
        ServletOutputStream output = null;
        try {
            output = response.getOutputStream();
            output.write(("所传入的文件类型是不被允许的，允许的文件类型是：" + Arrays.toString(allowFileTypeList.toArray())).getBytes(request.getCharacterEncoding()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void setAllowFileType(String allowFileType) {
        //默认运行所有的类型
        if (StringUtils.isEmpty(allowFileType)) {
            allowFileTypeList = null;
            return;
        }
        allowFileTypeList = Arrays.asList(allowFileType.split(","));
    }

}
