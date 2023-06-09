package com.example.testfileupload.security.service;

import com.example.testfileupload.model.ProjectSubmission;
import com.example.testfileupload.repositories.ProjectSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProjectSubmissionService {

    @Autowired
    private ProjectSubmissionRepository projectSubmissionRepository;

    public ProjectSubmission addProjectSubmission(ProjectSubmission p)
    {
        return projectSubmissionRepository.save(p);
    }

    public ProjectSubmission updateProjectrSubmission(ProjectSubmission p){return projectSubmissionRepository.save(p);}

    public void deleteProjectSubmission(Long id)
    {
        projectSubmissionRepository.deleteById(id);
    }

    public ProjectSubmission getProjectSubmissionById(Long id)
    {
        return projectSubmissionRepository.findById(id).get();
    }

    public Set<ProjectSubmission> getAllProjectSubmissions()
    {
        return  projectSubmissionRepository.findAll().stream().collect(Collectors.toSet());
    }

    public Set<ProjectSubmission> getProjectSubmissionsByStudentId(Long id)
    {
        return projectSubmissionRepository.findByUserId(id);
    }
}
