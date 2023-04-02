package com.example.testfileupload.security.service;

import com.example.testfileupload.model.ProjectFile;
import com.example.testfileupload.repositories.ProjectFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Service
public class ProjectFileService {

    @Autowired
    private ProjectFileRepository projectFileRepository;

    public ProjectFile store(MultipartFile file ) throws IOException
    {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        ProjectFile projectFile = new ProjectFile(filename,file.getContentType(), file.getBytes());

        return projectFileRepository.save(projectFile);
    }

    public ProjectFile getFile(Long id)
    {
        return projectFileRepository.findById(id).get();
    }

    public Stream<ProjectFile> getAllFiles()
    {
        return projectFileRepository.findAll().stream();
    }
}
