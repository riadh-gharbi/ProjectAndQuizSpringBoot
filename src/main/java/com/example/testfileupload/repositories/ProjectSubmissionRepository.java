package com.example.testfileupload.repositories;

import com.example.testfileupload.model.ProjectSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProjectSubmissionRepository extends JpaRepository<ProjectSubmission,Long> {
    @Query("select p from ProjectSubmission p where p.user.id = ?1")
    Set<ProjectSubmission> findByUserId(Long id);
}
