package com.example.testfileupload.repositories;

import com.example.testfileupload.model.UserQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQuestionAnswerRepository extends JpaRepository<UserQuestionAnswer,Long> {
}
