package com.example.testfileupload.controllers;

import com.example.testfileupload.model.ProjectSubmission;
import com.example.testfileupload.security.service.ProjectSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/projectSub")
public class ProjectSubmissionController {
    @Autowired
    private ProjectSubmissionService projectSubmissionService;

    @GetMapping
    public Set<ProjectSubmission> getAllSubmissions()
    {
        return projectSubmissionService.getAllProjectSubmissions();
    }

    @PostMapping
    public void addProjectSubmisison(@RequestParam ProjectSubmission p)
    {
        projectSubmissionService.addProjectSubmission(p);
    }

    @PutMapping
    public void updateProjectSubmission(@RequestParam ProjectSubmission p)
    {
        projectSubmissionService.updateProjectrSubmission(p);
    }

    @DeleteMapping("/{id}")
    public void deleteProjectSubmission(@PathVariable Long id)
    {
        projectSubmissionService.deleteProjectSubmission(id);
    }

    @GetMapping("/{id}")
    public ProjectSubmission getProjectSubmissionById(@PathVariable Long id)
    {
        return projectSubmissionService.getProjectSubmissionById(id);
    }

    @GetMapping("/student/{id}")
    public Set<ProjectSubmission> getProjectSubmissionByStudent(Long id)
    {
        return projectSubmissionService.getProjectSubmissionsByStudentId(id);
    }
}
