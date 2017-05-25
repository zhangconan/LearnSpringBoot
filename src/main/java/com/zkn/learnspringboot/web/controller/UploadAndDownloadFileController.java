package com.zkn.learnspringboot.web.controller;

import java.io.*;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by wb-zhangkenan on 2017/5/22.
 *
 * @author wb-zhangkenan
 * @date 2017/05/22
 */
@Controller
@RequestMapping("/uploadAndDownload")
public class UploadAndDownloadFileController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {

        return "uploadAndDownload";
    }

    @RequestMapping(value = "/uploadFileAction", method = RequestMethod.POST)
    public ModelAndView uploadFileAction(@RequestParam("uploadFile") MultipartFile uploadFile, @RequestParam("id") Long id,HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("uploadAndDownload");
        InputStream fis = null;
        OutputStream outputStream = null;
        try {
            fis = uploadFile.getInputStream();
            outputStream = new FileOutputStream(request.getServletContext().getRealPath("")+File.separator+uploadFile.getOriginalFilename());
            IOUtils.copy(fis,outputStream);
            modelAndView.addObject("sucess", "上传成功");
            return modelAndView;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        modelAndView.addObject("sucess", "上传失败!");
        return modelAndView;
    }

    @RequestMapping("downloadFileAction")
    public void downloadFileAction(HttpServletRequest request, HttpServletResponse response) {

        response.setCharacterEncoding(request.getCharacterEncoding());
        response.setContentType("application/octet-stream");
        FileInputStream fis = null;
        try {
            File file = new File("G:\\config.ini");
            fis = new FileInputStream(file);
            response.setHeader("Content-Disposition", "attachment; filename="+file.getName());
            IOUtils.copy(fis,response.getOutputStream());
            response.flushBuffer();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
