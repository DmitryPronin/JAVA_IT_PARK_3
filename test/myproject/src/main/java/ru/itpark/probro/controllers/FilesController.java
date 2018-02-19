package ru.itpark.probro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.itpark.probro.services.FilesService;

import javax.servlet.http.HttpServletResponse;

@Controller
public class FilesController {
    @Autowired
    private FilesService filesService;

    @PostMapping(value = "/files")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public String handleFileUpload(@RequestParam("file") MultipartFile multipartFile,
                                   Authentication authentication) {

        return filesService.save(authentication, multipartFile);
    }

    @GetMapping("/files/{file-name:.+}")
    public void getFile(@PathVariable("file-name") String fileName,
                        HttpServletResponse response) {
        filesService.writeFileTOResponse(fileName, response);
    }
}