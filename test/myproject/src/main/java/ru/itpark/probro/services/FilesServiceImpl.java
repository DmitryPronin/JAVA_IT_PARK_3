package ru.itpark.probro.services;

import lombok.SneakyThrows;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.itpark.probro.models.FileInfo;
import ru.itpark.probro.models.User;
import ru.itpark.probro.repositories.FilesInfoRepository;
import ru.itpark.probro.repositories.UserRepository;


import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    private FilesInfoRepository filesInfoRepository;

    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private AuthenticationService authenticationService;

    @Value(value = "${storage.path}")
    private String storagePath;

    @Value(value = "${web.path}")
    private String webPath;

    @Override
    @SneakyThrows
    public String save(Authentication authentication, MultipartFile multipartFile) {
        User user = authenticationService.getUserByAuthentication(authentication);
        FileInfo fileInfo = filesInfoRepository.findOneByUserId(user.getId());
        if (fileInfo!=null){
        fileInfo.setOriginalName(multipartFile.getOriginalFilename());
        fileInfo.setSize(multipartFile.getSize());
        fileInfo.setType(multipartFile.getContentType());
        }else {
                fileInfo = FileInfo.builder()
                .originalName(multipartFile.getOriginalFilename())
                .size(multipartFile.getSize())
                .user(user)
                .type(multipartFile.getContentType())
                .build();
        }
        String newName = UUID.randomUUID().toString().replace("-","");
        String extension = multipartFile.getOriginalFilename()
                .substring(multipartFile.getOriginalFilename().lastIndexOf("."),
                        multipartFile.getOriginalFilename().length());
        fileInfo.setStorageName(newName + extension);
        fileInfo.setUrl(storagePath + "\\" + fileInfo.getStorageName());
        fileInfo.setWeburl(webPath + "/" + fileInfo.getStorageName());
        Files.copy(multipartFile.getInputStream(),
                Paths.get(storagePath, fileInfo.getStorageName()));
        filesInfoRepository.save(fileInfo);
        return "File load to server";
    }

    @Override
    @SneakyThrows
    public void writeFileTOResponse(String fileName, HttpServletResponse response) {
        FileInfo fileInfo = filesInfoRepository.findOneByStorageName(fileName);
        response.setContentType(fileInfo.getType());
        InputStream inputStream = new FileInputStream(
                new File(fileInfo.getUrl()));
        IOUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();
    }
}