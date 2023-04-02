package com.example.testfileupload.repositories;

import com.example.testfileupload.model.ProjectFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectFileRepository  extends JpaRepository<ProjectFile,Long> {
}
