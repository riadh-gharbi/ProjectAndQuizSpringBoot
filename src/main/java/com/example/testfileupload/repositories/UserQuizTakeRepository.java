package com.example.testfileupload.repositories;

import com.example.testfileupload.model.UserQuizTake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuizTakeRepository extends JpaRepository<UserQuizTake,Long> {
}
