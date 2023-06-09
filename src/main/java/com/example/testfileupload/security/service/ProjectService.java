package com.example.testfileupload.security.service;


import com.example.testfileupload.model.Project;
import com.example.testfileupload.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.stream.Stream;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Project p)
    {
        return projectRepository.save(p);
    }
    public Project updateProject(Project p)
    {
        Assert.notNull(projectRepository.findById(p.getId()));
        return projectRepository.save(p);
    }

    public void deleteProject(Long id)
    {
        projectRepository.deleteById(id);
    }

    public Project getProjectById(Long id)
    {
        return projectRepository.findById(id).get();
    }

    public Stream<Project> getAllProjects()
    {
        return projectRepository.findAll().stream();
    }

    public Stream<Project> getProjectsByTeacher(Long id){ return projectRepository.findProjectByUserId(id).stream();}
}
