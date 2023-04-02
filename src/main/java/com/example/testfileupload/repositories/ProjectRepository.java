package com.example.testfileupload.repositories;

import com.example.testfileupload.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    public Set<Project> findProjectByUserId(Long id);
}
